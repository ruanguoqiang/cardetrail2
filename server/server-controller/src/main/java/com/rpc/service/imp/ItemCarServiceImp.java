package com.rpc.service.imp;

import com.common.model.ZTreeNode;
import com.common.pojo.ItemCar;
import com.common.pojo.ItemCarExample;
import com.genaratexml.ItemCarMapper;
import com.qiangge.interf.ItemCarService;
import com.util.DtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCarServiceImp implements ItemCarService {

    @Autowired
    ItemCarMapper itemCarMapper;
    @Override
    public List<ZTreeNode> getItemcar(Long parId) {
        ItemCarExample itemCarExample=new ItemCarExample();
        ItemCarExample.Criteria criteria=itemCarExample.createCriteria();
        criteria.andParentIdEqualTo(parId);
        List<ItemCar> itemCarList=itemCarMapper.selectByExample(itemCarExample);
        List<ZTreeNode> zTreeNodes=new ArrayList<>();
        for (ItemCar itemCar:itemCarList){
            zTreeNodes.add(DtoUtil.TbItemCarZTreeNode(itemCar));
        }
        return zTreeNodes;
    }
}
