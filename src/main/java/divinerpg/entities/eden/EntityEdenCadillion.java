package divinerpg.entities.eden;

import divinerpg.entities.base.EntityDivineMob;
import divinerpg.registries.*;
import divinerpg.util.EntityStats;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class EntityEdenCadillion extends EntityDivineMob {
    public EntityEdenCadillion(EntityType<? extends MobEntity> type, World worldIn) {
        super(type, worldIn);
        this.experienceValue = 40;
    }
    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 1.3F;
    }
    public static AttributeModifierMap.MutableAttribute attributes() {
        return MonsterEntity.func_234295_eP_().createMutableAttribute(Attributes.MAX_HEALTH, EntityStats.edenCadillionHealth).createMutableAttribute(Attributes.ATTACK_DAMAGE, EntityStats.edenCadillionDamage).createMutableAttribute(Attributes.MOVEMENT_SPEED, EntityStats.edenCadillionSpeed).createMutableAttribute(Attributes.FOLLOW_RANGE, EntityStats.edenCadillionFollowRange);
    }
    public boolean canSpawn(IWorld worldIn, SpawnReason spawnReasonIn) {
//        return world.getBiome(getPosition()).doesSnowGenerate(worldIn, getPosition());
        //TODO - spawn return
        return true;
    }
    @Override
    protected void registerGoals() {
        super.registerGoals();
        addAttackingAI();
    }
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundRegistry.CADILLION;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundRegistry.GROWL_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundRegistry.GROWL_HURT;
    }

    @Override
    protected ResourceLocation getLootTable() {
        return LootTableRegistry.ENTITIES_EDEN_CADILLION;
    }
}