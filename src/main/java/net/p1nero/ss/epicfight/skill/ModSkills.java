package net.p1nero.ss.epicfight.skill;

import net.p1nero.ss.Config;
import net.p1nero.ss.SwordSoaring;
import yesman.epicfight.api.data.reloader.SkillManager;
import yesman.epicfight.api.forgeevent.SkillBuildEvent;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.SkillCategories;

public class ModSkills {

    public static Skill SWORD_SOARING;
    public static Skill RAIN_SCREEN;
    public static Skill RAIN_CUTTER;
    public static Skill YAKSHA_MASK;
    public static Skill STELLAR_RESTORATION;
    public static void registerSkills() {
        SkillManager.register(SwordSoaringSkill::new, Skill.createMoverBuilder(), SwordSoaring.MOD_ID, "sword_soaring");
        SkillManager.register(RainCutter::new, Skill.createBuilder().setResource(Skill.Resource.NONE).setCategory(SkillCategories.IDENTITY), SwordSoaring.MOD_ID, "rain_cutter");
        SkillManager.register(RainScreen::new, Skill.createBuilder().setResource(Skill.Resource.NONE).setCategory(SkillCategories.GUARD), SwordSoaring.MOD_ID, "rain_screen");
        SkillManager.register(YakshaMask::new, YakshaMask.createYakshaMaskBuilder(), SwordSoaring.MOD_ID, "yaksha_mask");
        SkillManager.register(StellarRestoration::new, Skill.createBuilder().setResource(Skill.Resource.NONE).setCategory(SkillCategories.DODGE), SwordSoaring.MOD_ID, "stellar_restoration");

    }

    public static void BuildSkills(SkillBuildEvent event){
        SWORD_SOARING = event.build(SwordSoaring.MOD_ID, "sword_soaring");
        RAIN_CUTTER = event.build(SwordSoaring.MOD_ID, "rain_cutter");
        YAKSHA_MASK = event.build(SwordSoaring.MOD_ID, "yaksha_mask");
        RAIN_SCREEN =  event.build(SwordSoaring.MOD_ID, "rain_screen");
        STELLAR_RESTORATION = event.build(SwordSoaring.MOD_ID, "stellar_restoration");
    }

}
