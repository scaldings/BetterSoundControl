package sschr15.fabricmods.bettersoundcontrol.common;

import sschr15.fabricmods.bettersoundcontrol.api.SoundCategoryEntrypoint;
import sschr15.fabricmods.bettersoundcontrol.api.SoundCategoryUtils;

import net.minecraft.sound.SoundCategory;

public class BetterSoundControlCategories implements SoundCategoryEntrypoint {
    /**
     * If a call to {@link SoundCategoryUtils#getCategory(String)} would result in {@code null},
     * this category is sent instead.
     */
    public static final SoundCategory UNKNOWN = SoundCategoryUtils.registerNewCategory("unknown");
    public static final SoundCategory GUI = SoundCategoryUtils.registerNewCategory("gui");
}
