package com.encore.spring.model;

import java.util.List;

import com.encore.spring.domain.Item;

public interface ItemDAO {
	List<Item> getItemList() throws Exception;
	Item getItem(Integer itemid) throws Exception;


}
