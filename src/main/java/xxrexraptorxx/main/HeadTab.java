package xxrexraptorxx.main;

import net.minecraft.client.Minecraft;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class HeadTab extends CreativeModeTab {

    public HeadTab() {
        super("builderstabs.headTab");
    }

        @Override
        public ItemStack makeIcon() {
                return createNBTItemStack("XxRexRaptorxX");
        }


    @OnlyIn(Dist.CLIENT)
    @Override
    public void fillItemList(NonNullList<ItemStack> ItemList) {
        super.fillItemList(ItemList);

        ItemList.add(createNBTItemStack("XxRexRaptorxX"));
        ItemList.add(createNBTItemStack(Minecraft.getInstance().player.getName().getString()));
        ItemList.add(createNBTItemStack("MHF_Steve"));
        ItemList.add(createNBTItemStack("MHF_Alex"));
        ItemList.add(createNBTItemStack("MHF_Blaze"));
        ItemList.add(createNBTItemStack("MHF_CaveSpider"));
        ItemList.add(createNBTItemStack("MHF_Chicken"));
        ItemList.add(createNBTItemStack("MHF_Cow"));
        ItemList.add(createNBTItemStack("MHF_Creeper"));
        ItemList.add(createNBTItemStack("MHF_Enderman"));
        ItemList.add(createNBTItemStack("MHF_Ghast"));
        ItemList.add(createNBTItemStack("MHF_Golem"));
        ItemList.add(createNBTItemStack("MHF_Herobrine"));
        ItemList.add(createNBTItemStack("MHF_LavaSlime"));
        ItemList.add(createNBTItemStack("MHF_MushroomCow"));
        ItemList.add(createNBTItemStack("MHF_Ocelot"));
        ItemList.add(createNBTItemStack("MHF_Pig"));
        ItemList.add(createNBTItemStack("MHF_PigZombie"));
        ItemList.add(createNBTItemStack("MHF_Sheep"));
        ItemList.add(createNBTItemStack("MHF_Skeleton"));
        ItemList.add(createNBTItemStack("MHF_Slime"));
        ItemList.add(createNBTItemStack("MHF_Spider"));
        ItemList.add(createNBTItemStack("MHF_Squid"));
        ItemList.add(createNBTItemStack("MHF_Villager"));
        ItemList.add(createNBTItemStack("MHF_WSkeleton"));
        ItemList.add(createNBTItemStack("MHF_Zombie"));
        ItemList.add(createNBTItemStack("MHF_Cactus"));
        ItemList.add(createNBTItemStack("MHF_Cake"));
        ItemList.add(createNBTItemStack("MHF_Chest"));
        ItemList.add(createNBTItemStack("MHF_CoconutB"));
        ItemList.add(createNBTItemStack("MHF_CoconutG"));
        ItemList.add(createNBTItemStack("MHF_Melon"));
        ItemList.add(createNBTItemStack("MHF_OakLog"));
        ItemList.add(createNBTItemStack("MHF_Present1"));
        ItemList.add(createNBTItemStack("MHF_Present2"));
        ItemList.add(createNBTItemStack("MHF_Pumpkin"));
        ItemList.add(createNBTItemStack("MHF_TNT"));
        ItemList.add(createNBTItemStack("MHF_TNT2"));
        ItemList.add(createNBTItemStack("MHF_ArrowUp"));
        ItemList.add(createNBTItemStack("MHF_ArrowDown"));
        ItemList.add(createNBTItemStack("MHF_ArrowLeft"));
        ItemList.add(createNBTItemStack("MHF_ArrowRight"));
        ItemList.add(createNBTItemStack("MHF_Exclamation"));
        ItemList.add(createNBTItemStack("MHF_Question"));
    }




    private static ItemStack createNBTItemStack(String name) {
        CompoundTag nbt = new CompoundTag();
        nbt.putString("SkullOwner", name);

        ItemStack itemstack = new ItemStack(Items.PLAYER_HEAD);
        itemstack.setTag(nbt);

        return itemstack;
    }

}
