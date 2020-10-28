package simElectricity;

import simElectricity.blocks.BasicBlock;
import simElectricity.blocks.MultiBlock;
import simElectricity.utils.SEBlock;


public class BlockRegistery {
    public static SEBlock block1;

	public static void init(){
    	block1 = new BasicBlock();
      // add new blocks later?
	}
}
