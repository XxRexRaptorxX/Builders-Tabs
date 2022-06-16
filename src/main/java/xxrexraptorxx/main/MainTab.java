package xxrexraptorxx.main;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MainTab extends CreativeModeTab {

    public MainTab() {
        super("builderstabs.mainTab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Blocks.COMMAND_BLOCK);
    }


    @OnlyIn(Dist.CLIENT)
    @Override
    public void fillItemList(NonNullList<ItemStack> ItemList) {
        super.fillItemList(ItemList);


        ItemList.add(new ItemStack(Blocks.COMMAND_BLOCK));
        ItemList.add(new ItemStack(Blocks.CHAIN_COMMAND_BLOCK));
        ItemList.add(new ItemStack(Blocks.REPEATING_COMMAND_BLOCK));
        ItemList.add(new ItemStack(Items.COMMAND_BLOCK_MINECART));
        ItemList.add(new ItemStack(Blocks.STRUCTURE_BLOCK));
        ItemList.add(new ItemStack(Blocks.JIGSAW));
        ItemList.add(new ItemStack(Blocks.STRUCTURE_VOID));
        ItemList.add(new ItemStack(Blocks.BARRIER));
        ItemList.add(new ItemStack(Blocks.SPAWNER));
        ItemList.add(new ItemStack(Blocks.DRAGON_EGG));
        ItemList.add(new ItemStack(Items.DEBUG_STICK));
        ItemList.add(new ItemStack(Items.KNOWLEDGE_BOOK));
        ItemList.add(new ItemStack(Items.BUNDLE));
        ItemList.add(new ItemStack(Items.LIGHT));
    }
}
