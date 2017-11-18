public class SotaController {
	private Presentation;
	
	public SotaCotroller(){
		Presentation prsn = new Presentation();
		
	}
	
	/**
	selectPpt
	プレゼンするパワーポイントの指定
	**/
	public boolean selectPpt(String _pptNo){
		if(!prsn.setPresentaion(_pptNo)){
			return false;
		}
		
		return true;
	}
	
	/**
	doPresentation
	プレゼンの実行
	戻り値：Sotaに発話させる文字列
	**/
	public String doPresentation(String _seqNo){
		String spchTxt;
		spchTxt = prsn.getSpeechTxt(_seqNo);
		
		return spchTxt;
	}
}