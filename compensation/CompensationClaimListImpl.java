package compensation;

import java.util.ArrayList;

public class CompensationClaimListImpl implements CompensationClaimList {

	private ArrayList<CompensationClaim> compensationClaimList;

	public CompensationClaimListImpl(){
		this.compensationClaimList = new ArrayList<CompensationClaim>();
	}


	public void add(CompensationClaim compensationClaim){
		compensationClaimList.add(compensationClaim);
	}
	public void delete(){

	}

	public ArrayList<CompensationClaim> get() {
		return compensationClaimList;
	}

	public void update(){

	}

}