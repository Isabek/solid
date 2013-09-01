class TaxiTrsansformer implements IMegaTrsansformer {
	public void transformToCar() {
		System.out.println("Я преобразовался и стал такси!");
	}
	public void transformToShip() {
		throw new Exception("Данная трансформация не поддерживается");
	}
	public void transformToPlane() {
		throw new Exception("Данная трансформация не поддерживается");
	}
}