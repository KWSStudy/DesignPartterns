package com.kws.iterate;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator  implements Iterator<MenuItem> {
	ArrayList<MenuItem> menuItems;
	int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= menuItems.size() || menuItems.get(position) == null	) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = menuItems.get(position);
		position++;
		return menuItem;
	}

}
