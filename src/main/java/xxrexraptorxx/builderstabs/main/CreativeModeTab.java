package xxrexraptorxx.builderstabs.main;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTab {

    public static final DeferredRegister<net.minecraft.world.item.CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BuildersTabs.MODID);

    public static void init() { CREATIVE_MODE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus()); }


    public static final RegistryObject<net.minecraft.world.item.CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register(BuildersTabs.MODID, () -> net.minecraft.world.item.CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + BuildersTabs.MODID + "_tab"))
            .icon(() -> createNBTItemStack(Minecraft.getInstance().player.getName().getString()))
            .displayItems((params, output) -> {
                output.accept(createNBTItemStack("XxRexRaptorxX"));
                output.accept(createNBTItemStack(Minecraft.getInstance().player.getName().getString()));
                output.accept(createNBTItemStack("MHF_Steve"));
                output.accept(createNBTItemStack("MHF_Alex"));
                output.accept(createNBTItemStack("MHF_Blaze"));
                output.accept(createNBTItemStack("MHF_CaveSpider"));
                output.accept(createNBTItemStack("MHF_Chicken"));
                output.accept(createNBTItemStack("MHF_Cow"));
                output.accept(createNBTItemStack("MHF_Creeper"));
                output.accept(createNBTItemStack("MHF_Enderman"));
                output.accept(createNBTItemStack("MHF_Ghast"));
                output.accept(createNBTItemStack("MHF_Golem"));
                output.accept(createNBTItemStack("MHF_Herobrine"));
                output.accept(createNBTItemStack("MHF_LavaSlime"));
                output.accept(createNBTItemStack("MHF_MushroomCow"));
                output.accept(createNBTItemStack("MHF_Ocelot"));
                output.accept(createNBTItemStack("MHF_Pig"));
                output.accept(createNBTItemStack("MHF_PigZombie"));
                output.accept(createNBTItemStack("MHF_Sheep"));
                output.accept(createNBTItemStack("MHF_Skeleton"));
                output.accept(createNBTItemStack("MHF_Slime"));
                output.accept(createNBTItemStack("MHF_Spider"));
                output.accept(createNBTItemStack("MHF_Squid"));
                output.accept(createNBTItemStack("MHF_Villager"));
                output.accept(createNBTItemStack("MHF_WSkeleton"));
                output.accept(createNBTItemStack("MHF_Zombie"));
                output.accept(createNBTItemStack("MHF_Cactus"));
                output.accept(createNBTItemStack("MHF_Cake"));
                output.accept(createNBTItemStack("MHF_Chest"));
                output.accept(createNBTItemStack("MHF_CoconutB"));
                output.accept(createNBTItemStack("MHF_CoconutG"));
                output.accept(createNBTItemStack("MHF_Melon"));
                output.accept(createNBTItemStack("MHF_OakLog"));
                output.accept(createNBTItemStack("MHF_Present1"));
                output.accept(createNBTItemStack("MHF_Present2"));
                output.accept(createNBTItemStack("MHF_Pumpkin"));
                output.accept(createNBTItemStack("MHF_TNT"));
                output.accept(createNBTItemStack("MHF_TNT2"));
                output.accept(createNBTItemStack("MHF_ArrowUp"));
                output.accept(createNBTItemStack("MHF_ArrowDown"));
                output.accept(createNBTItemStack("MHF_ArrowLeft"));
                output.accept(createNBTItemStack("MHF_ArrowRight"));
                output.accept(createNBTItemStack("MHF_Exclamation"));
                output.accept(createNBTItemStack("MHF_Question"));
            }).build());


    private static ItemStack createNBTItemStack(String name) {
        CompoundTag nbt = new CompoundTag();
        nbt.putString("SkullOwner", name);

        ItemStack itemstack = new ItemStack(Items.PLAYER_HEAD);
        itemstack.setTag(nbt);

        return itemstack;
    }
}
