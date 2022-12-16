// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class facehugger_entity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "facehugger_entity"), "main");
	private final ModelPart facehugger;

	public facehugger_entity(ModelPart root) {
		this.facehugger = root.getChild("facehugger");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition facehugger = partdefinition.addOrReplaceChild("facehugger", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = facehugger.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5F, -0.3132F, -0.0746F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0F, 3.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r2 = facehugger.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 8).addBox(0.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 10).addBox(0.0F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 10).addBox(0.0F, -1.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, 4.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r3 = facehugger.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 6).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 0).addBox(-4.0F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 0).addBox(-4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 4.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r4 = facehugger.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 10).addBox(-0.5F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, -1.0F, 0.5585F, 1.1026F, 0.6109F));

		PartDefinition cube_r5 = facehugger.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(11, 0).addBox(-5.0F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, -1.0F, 0.5585F, -1.1026F, -0.6109F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		facehugger.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}