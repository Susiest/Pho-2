package susiest.pho.mod;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class PhoFoodComponent {

    public static final FoodComponent CHICKEN_PHO = (new FoodComponent.Builder()).hunger(10).saturationModifier((float) 1.2).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 1), 1F).build();
    public static final FoodComponent BEEF_PHO = (new FoodComponent.Builder()).hunger(10).saturationModifier((float) 1.2).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 1), 1F).build();

}
