class StelthTrsansformer implements IMegaTrsansformer {
	public void transformToCar() {
		throw new Exception("Данная трансформация не поддерживается");
	}
	public void transformToShip() {
		throw new Exception("Данная трансформация не поддерживается");
	}
	public void transformToPlane() {
		System.out.println("Я преобразовался и стал стелсом!");
	}
}