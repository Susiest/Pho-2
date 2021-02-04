package susiest.pho.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PhoMod implements ModInitializer {

	public static final Item FLOUR = new Item(new Item.Settings().group(ItemGroup.MISC));
	
	public static final Item BROTH = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item CHICKEN_PHO = new Item(new Item.Settings().group(ItemGroup.FOOD).food(PhoFoodComponent.CHICKEN_PHO));
	public static final Item BEEF_PHO = new Item(new Item.Settings().group(ItemGroup.FOOD).food(PhoFoodComponent.BEEF_PHO));

	@Override
	public void onInitialize() {
		
		Registry.register(Registry.ITEM, new Identifier("phomod", "flour"), FLOUR);
		Registry.register(Registry.ITEM, new Identifier("phomod", "broth"), BROTH);

		Registry.register(Registry.ITEM, new Identifier("phomod", "chicken_pho"), CHICKEN_PHO);
		Registry.register(Registry.ITEM, new Identifier("phomod", "beef_pho"), BEEF_PHO);
	}
}
