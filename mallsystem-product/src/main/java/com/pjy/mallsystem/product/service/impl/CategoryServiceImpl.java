package com.pjy.mallsystem.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pjy.mallsystem.common.utils.PageUtils;
import com.pjy.mallsystem.common.utils.Query;
import com.pjy.mallsystem.product.dao.CategoryDao;
import com.pjy.mallsystem.product.entity.CategoryEntity;
import com.pjy.mallsystem.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> list = baseMapper.selectList(null);
        List<CategoryEntity> MenuTree = list.parallelStream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map( (categoryEntity)->{
                        categoryEntity.setChildren(getChidrenFrom(categoryEntity.getCatId(),list));
                        return categoryEntity;
                })
                .sorted((cE1,cE2)->{
                    if(cE1.getSort()==null){
                        return -1;
                    }
                    if (cE2.getSort()==null){
                        return 1;
                    }
                    return cE1.getSort()-cE2.getSort();
                })
                .collect(Collectors.toList());
        return MenuTree;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 检查当前删除的菜单是否被被的地方引用
        baseMapper.deleteBatchIds(asList);
    }


    private List<CategoryEntity> getChidrenFrom(Long catId, List<CategoryEntity> list) {
        return list.parallelStream()
                .filter(categoryEntity -> categoryEntity.getParentCid().equals(catId))
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChidrenFrom(categoryEntity.getCatId(),list));
                    return categoryEntity;
                })
                .sorted((cE1,cE2)->{
                    if(cE1.getSort()==null){
                        return -1;
                    }
                    if (cE2.getSort()==null){
                        return 1;
                    }
                    return cE1.getSort()-cE2.getSort();
                })
                .collect(Collectors.toList());
    }


}