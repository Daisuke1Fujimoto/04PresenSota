public class SotaController {
	private Presentation;
	
	public SotaCotroller(){
		Presentation prsn = new Presentation();
		
	}
	
	/**
	selectPpt
	�v���[������p���[�|�C���g�̎w��
	**/
	public boolean selectPpt(String _pptNo){
		if(!prsn.setPresentaion(_pptNo)){
			return false;
		}
		
		return true;
	}
	
	/**
	doPresentation
	�v���[���̎��s
	�߂�l�FSota�ɔ��b�����镶����
	**/
	public String doPresentation(String _seqNo){
		String spchTxt;
		spchTxt = prsn.getSpeechTxt(_seqNo);
		
		return spchTxt;
	}
}