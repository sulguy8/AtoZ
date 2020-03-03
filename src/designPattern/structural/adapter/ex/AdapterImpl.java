package designPattern.structural.adapter.ex;

public class AdapterImpl implements Adapter{
// 알고리즘을 요구사항에 맞춰서 사용할 수 있을까? 어댑터 패턴 사용!
	@Override
	public Float twiceOf(Float f) {
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {		
		// 그저 여기에다 기능을 추가한건데 Main과 Math 알고리즘을 안건드려도 됨.
		System.out.println("절반 함수 호출 시작");
		return (float) Math.half(f.doubleValue());
	}

}
