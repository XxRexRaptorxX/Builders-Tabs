package xxrexraptorxx.builderstabs.main;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.client.Minecraft;
import net.minecraft.commands.arguments.item.ItemParser;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ResolvableProfile;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;

public class CreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BuildersTabs.MODID) ;

    public static void init(IEventBus bus) { CREATIVE_MODE_TABS.register(bus); }


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register(BuildersTabs.MODID, () -> CreativeModeTab.builder()
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

    //TODO FIX!
    private static ItemStack createNBTItemStack(String name) {
        ItemStack stack = new ItemStack(Items.PLAYER_HEAD);
        stack.set(DataComponents.PROFILE, new ResolvableProfile(Optional.ofNullable(name), Optional.empty(), new PropertyMap()));

        return stack;
    }


    UUID XxRexRaptorxX_UUID = UUID.fromString("f83183e3-53c8-4f32-bfe5-5364f9d55d72");
    UUID MHF_Steve_UUID = UUID.fromString("8667ba71-b85a-4004-af54-457a9734eed7");
    UUID MHF_Alex_UUID = UUID.fromString("25f367fa-732b-4427-8c4b-1ef9cc5a0172");
    UUID MHF_Blaze_UUID = UUID.fromString("c2e2d4ea-4ea8-405b-b3c3-d3d8be5cea72");
    UUID MHF_CaveSpider_UUID = UUID.fromString("63f7068e-07e9-42f5-a98f-621dd27923cb");
    UUID MHF_Chicken_UUID = UUID.fromString("0e18f7d6-c212-4864-baf3-4f5f16c5c3c3");
    UUID MHF_Cow_UUID = UUID.fromString("7f4146e6-7cc9-4b3f-a093-de50b16ccc5a");
    UUID MHF_Creeper_UUID = UUID.fromString("e0b5f88e-5d7a-4181-b883-b6f0dab3a177");
    UUID MHF_Enderman_UUID = UUID.fromString("7c3d8d06-3f8f-4a69-95c0-28b17eeaa2c0");
    UUID MHF_Ghast_UUID = UUID.fromString("0f46f67a-4488-42d3-b600-f8c5a36b9c3b");
    UUID MHF_Golem_UUID = UUID.fromString("8d707f80-902a-4c77-aae2-ce0b9a6f7b20");
    UUID MHF_Herobrine_UUID = UUID.fromString("146ef01b-6c9e-49e8-9a1c-c65cfc39e5d0");
    UUID MHF_LavaSlime_UUID = UUID.fromString("8c39a8d2-d2c2-44e0-bfb6-cc6d3a85b600");
    UUID MHF_MushroomCow_UUID = UUID.fromString("5fb5c1b1-c6c9-4478-b889-2d7c5a9d5c85");
    UUID MHF_Ocelot_UUID = UUID.fromString("5f8bd860-d4f7-4f5e-8d27-b2f026a2f9b5");
    UUID MHF_Pig_UUID = UUID.fromString("9ef3d0b0-d3aa-479e-984f-c3c647b4831b");
    UUID MHF_PigZombie_UUID = UUID.fromString("a61b92a2-b2b5-451e-a29f-6dc027b7d1f6");
    UUID MHF_Sheep_UUID = UUID.fromString("2b0f4cca-9d44-4b2e-8226-d84e52c6aa76");
    UUID MHF_Skeleton_UUID = UUID.fromString("a0a498c6-c9ef-4726-af2b-65a1f9e22904");
    UUID MHF_Slime_UUID = UUID.fromString("58da67ed-5ac2-4a52-979e-48b0d9e08e28");
    UUID MHF_Spider_UUID = UUID.fromString("c56b637c-f5a2-45c3-a7f1-b93f0b3d6ea7");
    UUID MHF_Squid_UUID = UUID.fromString("2a51430b-b3ef-459c-9c55-446102e7f7b1");
    UUID MHF_Villager_UUID = UUID.fromString("616d895f-60f6-4d7e-ab79-1e12a8b7b91a");
    UUID MHF_WSkeleton_UUID = UUID.fromString("c6ea4b93-e4c5-4dbd-9df3-8b8f2a9e287e");
    UUID MHF_Zombie_UUID = UUID.fromString("6075a421-5b31-4b6c-8b6d-7e7de0e46e5b");
    UUID MHF_Cactus_UUID = UUID.fromString("b14a1d0d-39e5-4fb5-aa7e-0b6b2737e35b");
    UUID MHF_Cake_UUID = UUID.fromString("9c0f9e25-52d6-467e-b04a-907cfa208f8c");
    UUID MHF_Chest_UUID = UUID.fromString("7a02e0ca-29d1-4218-9b47-923d3660c0e8");
    UUID MHF_CoconutB_UUID = UUID.fromString("51b6f62c-23ff-4e1e-ac7e-1f89970a0d6a");
    UUID MHF_CoconutG_UUID = UUID.fromString("77e2e96e-4a6f-48e9-b2f0-300fb3a55eb7");
    UUID MHF_Melon_UUID = UUID.fromString("6a4b0e1d-7c5d-4d0c-9357-f570d1d061b1");
    UUID MHF_OakLog_UUID = UUID.fromString("4a3f0c7a-63e3-4d28-b6bf-8b91f27740ed");
    UUID MHF_Present1_UUID = UUID.fromString("7466f2b3-c8e8-4671-a90b-96784c5b4cf6");
    UUID MHF_Present2_UUID = UUID.fromString("46fcb3c8-f827-4d69-9efa-cf9e71ab6e1b");
    UUID MHF_Pumpkin_UUID = UUID.fromString("52b80bc4-6d4b-4a20-94cc-1b57b2d80f3f");
    UUID MHF_TNT_UUID = UUID.fromString("4b26eaa0-8be3-4f67-aee7-0f90f66d6dc3");
    UUID MHF_TNT2_UUID = UUID.fromString("3c64ed0a-5a1b-4aef-9388-f6cd76a6f5d0");
    UUID MHF_ArrowUp_UUID = UUID.fromString("e70ebf3a-5efb-4c50-97f9-b8f1f8b0ac3c");
    UUID MHF_ArrowDown_UUID = UUID.fromString("a5b1f5c9-0eb1-4606-a36b-0e6b5c4b58dd");
    UUID MHF_ArrowLeft_UUID = UUID.fromString("1f4e1979-f07d-4ce1-a04e-4fbd8727f051");
    UUID MHF_ArrowRight_UUID = UUID.fromString("6aaf9c2f-76a4-46a9-a3e6-630c8e8b2a25");
    UUID MHF_Exclamation_UUID = UUID.fromString("25d36ee1-807e-43b1-b5a3-274e7b9eb8c4");
    UUID MHF_Question_UUID = UUID.fromString("7864d17d-0b6d-47b1-8d50-a252af7a0d7e");
}
