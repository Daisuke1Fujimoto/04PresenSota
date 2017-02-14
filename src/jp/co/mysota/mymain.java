//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	jp.vstone.network.*;
import	java.awt.Color;
import	java.util.*;

public class mymain
{

	public CRobotPose pose;
	public String speechRecogResult;
	public RecogResult recogresult;
	public mymain()																										//@<BlockInfo>jp.vstone.block.func.constructor,48,16,304,16,False,4,@</BlockInfo>
	{
																														//@<OutputChild>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,112,16,112,16,False,3,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*String speechRecogResult*/;																					//@<BlockInfo>jp.vstone.block.variable,176,16,176,16,False,2,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*RecogResult recogresult*/;																					//@<BlockInfo>jp.vstone.block.variable,240,16,240,16,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void motionSpeeching(String motionCd)																		//@<BlockInfo>jp.vstone.block.func,640,592,1280,592,False,16,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		switch((String)motionCd)																						//@<BlockInfo>jp.vstone.block.switch,704,448,1216,448,False,15,@</BlockInfo>
		{
			case (String)"001":
			{
																														//@<OutputChild>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,768,448,768,448,False,7,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-378,-773,-1,722,-1,-3,-224,2}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,1600);
				CRobotUtil.wait(1600);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,832,448,832,448,False,6,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-625,-755,-699,688,776,-5,20,6}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,1400);
				CRobotUtil.wait(1400);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,896,448,896,448,False,5,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-378,-773,-1,722,-1,-3,-224,2}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,1400);
				CRobotUtil.wait(1400);																						//@<EndOfBlock/>
																																//@</OutputChild>
				break;
			}
			case (String)"002":
			{
																														//@<OutputChild>
																														//@</OutputChild>
				break;
			}
			case (String)"003":
			{
																														//@<OutputChild>
																														//@</OutputChild>
				break;
			}
			default:
			{
																														//@<OutputChild>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,768,736,768,736,False,14,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-1044,-594,-881,279,-13,-337,28,4}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{255,0,0,0,0,255,0,0,255}
								);
				GlobalVariable.motion.play(pose,1400);
				CRobotUtil.wait(1400);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,832,736,832,736,False,13,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-45,-64,-3,395,881,204,-270,-5}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{255,0,0,0,0,255,0,0,255}
								);
				GlobalVariable.motion.play(pose,1400);
				CRobotUtil.wait(1400);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,896,736,896,736,False,12,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-45,-58,-367,395,880,205,-53,-6}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{255,0,0,0,0,255,0,0,255}
								);
				GlobalVariable.motion.play(pose,1800);
				CRobotUtil.wait(1800);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,960,736,960,736,False,11,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-46,-183,-84,395,882,200,-270,-5}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{255,0,0,0,0,255,0,0,255}
								);
				GlobalVariable.motion.play(pose,1400);
				CRobotUtil.wait(1400);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,1024,736,1024,736,False,10,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{1,-467,51,396,26,126,-270,-5}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{255,0,0,0,0,255,0,0,255}
								);
				GlobalVariable.motion.play(pose,1400);
				CRobotUtil.wait(1400);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,1088,736,1088,736,False,9,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-5,13,-52,823,34,95,-253,-28}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{255,0,0,0,0,255,0,0,255}
								);
				GlobalVariable.motion.play(pose,1400);
				CRobotUtil.wait(1400);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,1152,736,1152,736,False,8,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-4,61,-890,823,35,92,-250,-242}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{255,0,0,0,0,255,0,0,255}
								);
				GlobalVariable.motion.play(pose,1400);
				CRobotUtil.wait(1400);																						//@<EndOfBlock/>
																																//@</OutputChild>
				break;
			}

		}																												//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void startCall()																								//@<BlockInfo>jp.vstone.block.func,48,896,768,896,False,24,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		while(GlobalVariable.TRUE)																						//@<BlockInfo>jp.vstone.block.while.endless,128,896,688,896,False,23,Endless@</BlockInfo>
		{

																														//@<OutputChild>
			recogresult = GlobalVariable.recog.getRecognitionwithAbort((int)60000);										//@<BlockInfo>jp.vstone.block.talk.speechrecog.regex2,208,848,608,848,False,22,音声認識を行い、結果を条件に正規表現文字列で比較する。認識スコアが一番高い結果に分岐する。実際に認識された文字列はspeechRecogResultに代入される@</BlockInfo>
			speechRecogResult = recogresult.CheckBest(new String[]{
			 ".*こんにちは.*" ,  "" , 
			},true);
			if(speechRecogResult == null) speechRecogResult = "";

			if(speechRecogResult.contains((String)".*こんにちは.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"みなさん、こんにちは！",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,288,848,288,848,False,21,@</BlockInfo>
																															//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,352,848,352,848,False,20,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{-684,413,-358,956,28,-595,50,-10}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,1000);
					CRobotUtil.wait(1000);																					//@<EndOfBlock/>
					CRobotUtil.wait((int)3000);																				//@<BlockInfo>jp.vstone.block.wait,416,848,416,848,False,19,コメント@</BlockInfo>	@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"元気な挨拶をありがとうございます。これから発表を始めます。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,480,848,480,848,False,18,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,544,848,544,848,False,17,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
																														//@</OutputChild>

			}
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void main()																									//@<BlockInfo>jp.vstone.block.func,0,176,1456,176,False,48,コメント@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		startCall();																									//@<BlockInfo>jp.vstone.block.callfunc.base,64,176,64,176,False,47,@</BlockInfo>	@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,128,176,128,176,False,46,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{0,-900,0,900,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,500);
		CRobotUtil.wait(500);																							//@<EndOfBlock/>
		{																												//@<BlockInfo>jp.vstone.block.tcpip.server.init,192,176,1360,176,False,45,@</BlockInfo>
			TCPIPServer tcpipServer = new TCPIPServer((short)5001,(int)60000);
			
																														//@<OutputChild>
			CRobotUtil.Log(getClass().getSimpleName(), (String)"◆初期化完了");												//@<BlockInfo>jp.vstone.block.printlog,256,176,256,176,False,44,@</BlockInfo>	@<EndOfBlock/>
			while(GlobalVariable.TRUE)																					//@<BlockInfo>jp.vstone.block.while.endless,352,176,1152,176,False,43,Endless@</BlockInfo>
			{

																														//@<OutputChild>
				CRobotUtil.Log(getClass().getSimpleName(), (String)"◆まち");												//@<BlockInfo>jp.vstone.block.printlog,416,176,416,176,False,40,@</BlockInfo>	@<EndOfBlock/>
				try{																									//@<BlockInfo>jp.vstone.block.tcpip.server,496,128,1072,128,False,39,@</BlockInfo>
					GlobalVariable.recvString = tcpipServer.waitRequest();

					if(GlobalVariable.recvString==null) GlobalVariable.recvString="";
					if(GlobalVariable.recvString.contentEquals((String)"End"))
					{
																														//@<OutputChild>
						CRobotUtil.Log(getClass().getSimpleName(), (String)GlobalVariable.recvString);						//@<BlockInfo>jp.vstone.block.printlog,560,128,560,128,False,26,@</BlockInfo>	@<EndOfBlock/>
						break;																								//@<BlockInfo>jp.vstone.block.break,624,128,624,128,False,25,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

					}
					else
					{
																														//@<OutputChild>
						String[] receiveStrAry=new String[3];																//@<BlockInfo>jp.vstone.block.variable,560,224,560,224,False,38,break@</BlockInfo>
																															//@<EndOfBlock/>
						CRobotUtil.Log(getClass().getSimpleName(), (String)GlobalVariable.recvString);						//@<BlockInfo>jp.vstone.block.printlog,624,224,624,224,False,37,@</BlockInfo>	@<EndOfBlock/>
						receiveStrAry=(String[])GlobalVariable.recvString.split(",",0);										//@<BlockInfo>jp.vstone.block.calculater,688,224,688,224,False,36,@</BlockInfo>
																															//@<EndOfBlock/>
						String varReceiveSpeechText=(String)receiveStrAry[2];												//@<BlockInfo>jp.vstone.block.variable,752,224,752,224,False,35,break@</BlockInfo>
																															//@<EndOfBlock/>
						String varReceiveMotionCd;																			//@<BlockInfo>jp.vstone.block.variable,816,224,816,224,False,34,break@</BlockInfo>
																															//@<EndOfBlock/>
						varReceiveMotionCd=(String)receiveStrAry[1];														//@<BlockInfo>jp.vstone.block.calculater,880,224,880,224,False,33,@</BlockInfo>
																															//@<EndOfBlock/>
						CRobotUtil.Log(getClass().getSimpleName(), (String)varReceiveSpeechText);							//@<BlockInfo>jp.vstone.block.printlog,944,224,944,224,False,32,@</BlockInfo>	@<EndOfBlock/>
						{																									//@<BlockInfo>jp.vstone.block.lock,560,320,880,320,False,31,関節のロック@</BlockInfo>
							ArrayList<Byte> svList = new ArrayList<Byte>();
							ArrayList<Byte> LEDList = new ArrayList<Byte>();
						
							if(true) svList.addAll(Arrays.asList(new Byte[]{CSotaMotion.SV_L_ELBOW,CSotaMotion.SV_L_SHOULDER}));
							if(true) svList.addAll(Arrays.asList(new Byte[]{CSotaMotion.SV_R_ELBOW,CSotaMotion.SV_R_SHOULDER}));
							if(true) svList.addAll(Arrays.asList(new Byte[]{CSotaMotion.SV_HEAD_P,CSotaMotion.SV_HEAD_Y,CSotaMotion.SV_HEAD_R}));
							if(true) svList.addAll(Arrays.asList(new Byte[]{CSotaMotion.SV_BODY_Y}));
							if(true) LEDList.addAll(Arrays.asList(new Byte[]{0,1,2}));
							if(true) LEDList.addAll(Arrays.asList(new Byte[]{8,9,10,11,12,13}));
						
							if(svList.size()>0) GlobalVariable.motion.LockServoHandle((Byte[]) svList.toArray(new Byte[0]));
							if(LEDList.size()>0) GlobalVariable.motion.LockLEDHandle((Byte[]) LEDList.toArray(new Byte[0]));
						
							{
							
							
																															//@<OutputChild>
								selectMotion((String)varReceiveMotionCd);														//@<BlockInfo>jp.vstone.block.callfunc.base,624,320,624,320,False,29,@</BlockInfo>	@<EndOfBlock/>
								{																								//@<BlockInfo>jp.vstone.block.thread,688,320,816,320,False,28,スレッド@</BlockInfo>
									Thread th = new Thread(new Runnable() {
										@Override
										public void run() {
											try{
												
												
																																//@<OutputChild>
												GlobalVariable.sotawish.Say((String)varReceiveSpeechText,MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,752,320,752,320,False,27,@</BlockInfo>
																																			//@<EndOfBlock/>
																																				//@</OutputChild>
								
												
											} catch(Exception e) {
												CRobotUtil.Err("jp.vstone.block.thread","例外が発生しました。");
												e.printStackTrace();
											}
										}
									});
									th.start();
								}
																																//@<EndOfBlock/>
																																	//@</OutputChild>
						}
							
						
							if(svList.size()>0) GlobalVariable.motion.UnLockServoHandle((Byte[]) svList.toArray(new Byte[0]));
							if(LEDList.size()>0) GlobalVariable.motion.UnLockLEDHandle((Byte[]) LEDList.toArray(new Byte[0]));
						}																									//@<EndOfBlock/>
						motionSpeeching((String)varReceiveMotionCd);														//@<BlockInfo>jp.vstone.block.callfunc.base,960,320,960,320,False,30,@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

					}
					
				} catch(Exception e) { }
																														//@<EndOfBlock/>
																														//@</OutputChild>
			}
																														//@<EndOfBlock/>
			pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,1232,176,1232,176,False,42,コメント@</BlockInfo>
			pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{0,-900,0,900,0,0,0,0}
							);
			pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{100,100,100,100,100,100,100,100}
							);
			pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
							new Short[]{0,-255,0,180,80,0,180,80,0}
							);
			GlobalVariable.motion.play(pose,500);
			CRobotUtil.wait(500);																						//@<EndOfBlock/>
			CRobotUtil.Log(getClass().getSimpleName(), (String)"◆ループ抜けました");											//@<BlockInfo>jp.vstone.block.printlog,1296,176,1296,176,False,41,@</BlockInfo>	@<EndOfBlock/>
																														//@</OutputChild>

			
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void selectMotion(String motionCd)																			//@<BlockInfo>jp.vstone.block.func,48,592,544,592,False,61,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		CRobotUtil.Log(getClass().getSimpleName(), (String)motionCd);													//@<BlockInfo>jp.vstone.block.printlog,112,592,112,592,False,60,@</BlockInfo>	@<EndOfBlock/>
		switch((String)motionCd)																						//@<BlockInfo>jp.vstone.block.switch,176,448,496,448,False,59,@</BlockInfo>
		{
			case (String)"001":
			{
																														//@<OutputChild>
				CRobotUtil.Log(getClass().getSimpleName(), (String)motionCd);												//@<BlockInfo>jp.vstone.block.printlog,240,448,240,448,False,50,@</BlockInfo>	@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,304,448,304,448,False,49,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{62,655,-33,688,777,463,-196,-9}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{255,0,0,0,255,0,0,255,0}
								);
				GlobalVariable.motion.play(pose,800);																		//@<EndOfBlock/>
																																//@</OutputChild>
				break;
			}
			case (String)"002":
			{
																														//@<OutputChild>
				CRobotUtil.Log(getClass().getSimpleName(), (String)motionCd);												//@<BlockInfo>jp.vstone.block.printlog,240,544,240,544,False,52,@</BlockInfo>	@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,304,544,304,544,False,51,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-1044,-593,-881,280,-14,-337,-188,-3}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{255,0,0,0,0,255,0,0,255}
								);
				GlobalVariable.motion.play(pose,1000);
				CRobotUtil.wait(1000);																						//@<EndOfBlock/>
																																//@</OutputChild>
				break;
			}
			case (String)"003":
			{
																														//@<OutputChild>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,240,640,240,640,False,56,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-325,652,-184,-703,279,-3,-270,-9}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,700);
				CRobotUtil.wait(700);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,304,640,304,640,False,55,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-325,-829,-611,870,584,143,11,-8}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,900);
				CRobotUtil.wait(900);																						//@<EndOfBlock/>
				CRobotUtil.wait((int)1500);																					//@<BlockInfo>jp.vstone.block.wait,368,640,368,640,False,54,コメント@</BlockInfo>	@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,432,640,432,640,False,53,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-331,-923,-229,601,-82,128,-270,-8}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,400);
				CRobotUtil.wait(400);																						//@<EndOfBlock/>
																																//@</OutputChild>
				break;
			}
			default:
			{
																														//@<OutputChild>
				CRobotUtil.Log(getClass().getSimpleName(), (String)"default通過");											//@<BlockInfo>jp.vstone.block.printlog,240,736,240,736,False,58,@</BlockInfo>	@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,304,736,304,736,False,57,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{0,-900,0,900,0,0,0,0}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,1400);																		//@<EndOfBlock/>
																																//@</OutputChild>
				break;
			}

		}																												//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
