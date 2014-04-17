package plantsInsects;

import repast.simphony.data2.AggregateDataSource;

public class InsectTypeDataSource implements AggregateDataSource {
	
	private String insectId;
	
	public InsectTypeDataSource(String insectId) {
		this.insectId = insectId;
	}

	@Override
	public String getId() {
		return insectId;
	}

	@Override
	public Class<?> getDataType() {
		return Integer.class;
	}

	@Override
	public Class<?> getSourceType() {
		return Insect.class;
	}

	@Override
	public Object get(Iterable<?> objs, int size) {
		int count = 0;
		while(objs.iterator().hasNext()) {
			Object ob = objs.iterator().next();
			if(ob instanceof Insect) {
				System.out.println("insect counted");
				Insect ins = (Insect) ob;
				if(ins.getSpeciesParams().getInsectId() == insectId) {
					count++;
				}
			}
		}
		
		return count;
	}

	@Override
	public void reset() {
		// do nothing like in CountDataSource
	}

}
