package naturix.divinerpg.objects.entities.assets.render.vanilla;

import javax.annotation.Nullable;

import naturix.divinerpg.objects.entities.assets.model.vanilla.ModelEnderWatcher;
import naturix.divinerpg.objects.entities.entity.vanilla.EnderWatcher;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderEnderWatcher extends RenderLiving<EnderWatcher> {
    public static final IRenderFactory FACTORY = new Factory();
    ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/ender_watcher.png");

    public RenderEnderWatcher(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelEnderWatcher(), shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EnderWatcher entity) {
        return texture;
    }

    public static class Factory implements IRenderFactory<EnderWatcher> {
        @Override
        public Render<? super EnderWatcher> createRenderFor(RenderManager manager) {
            return new RenderEnderWatcher(manager, new ModelEnderWatcher(), 0F);
        }
    }
}