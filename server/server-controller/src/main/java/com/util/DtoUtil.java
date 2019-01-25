package com.util;

import com.common.model.ZTreeNode;
import com.common.pojo.ItemCar;

public class DtoUtil {

    public static ZTreeNode TbItemCarZTreeNode(ItemCar tbItemCat){
        ZTreeNode zTreeNode =new ZTreeNode();
        zTreeNode.setId(Math.toIntExact(tbItemCat.getId()));
        zTreeNode.setStatus(tbItemCat.getStatus());
        zTreeNode.setSortOrder(tbItemCat.getSortOrder());
        zTreeNode.setName(tbItemCat.getName());
        zTreeNode.setpId(Math.toIntExact(tbItemCat.getParentId()));
        zTreeNode.setIsParent(tbItemCat.getIsParent());
        zTreeNode.setRemark(tbItemCat.getRemark());

        return zTreeNode;
    }
}
