class IcebreakerTrsansformer implements IMegaTrsansformer {
	public void transformToCar() {
		throw new Exception("Данная трансформация не поддерживается");
	}
	public void transformToShip() {
		System.out.println("Я преобразовался и стал ледоколом!");
	}
	public void transformToPlane() {
		throw new Exception("Данная трансформация не поддерживается");
	}
}