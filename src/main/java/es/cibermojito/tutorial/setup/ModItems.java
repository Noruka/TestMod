package es.cibermojito.tutorial.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> CIBER_INGOT = Registration.ITEMS.register("ciber_ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    static void register() {

    }

}
