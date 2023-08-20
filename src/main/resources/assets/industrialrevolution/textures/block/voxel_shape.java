public VoxelShape makeShape(){
	VoxelShape shape = VoxelShapes.empty();
	shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0.9375, 0.125, 0.8125, 1.1875, 0.5625));
	shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0, 1, 0.875, 1));
	shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.0625, 0.9375, 0.0625, 0.3125, 1.3125, 0.3125));
	shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.03125, 0.875, 0.03125, 0.34375, 0.9375, 0.34375));

	return shape;
}