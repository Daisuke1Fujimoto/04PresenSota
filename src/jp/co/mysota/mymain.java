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
	public void main()																									//@<BlockInfo>jp.vstone.block.func,48,224,1504,224,False,31,コメント@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		startCall();																									//@<BlockInfo>jp.vstone.block.callfunc.base,112,224,112,224,False,30,@</BlockInfo>	@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,176,224,176,224,False,29,コメント@</BlockInfo>
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
		{																												//@<BlockInfo>jp.vstone.block.tcpip.server.init,240,224,1408,224,False,28,@</BlockInfo>
			TCPIPServer tcpipServer = new TCPIPServer((short)5001,(int)60000);
			
																														//@<OutputChild>
			CRobotUtil.Log(getClass().getSimpleName(), (String)"◆初期化完了");												//@<BlockInfo>jp.vstone.block.printlog,304,224,304,224,False,27,@</BlockInfo>	@<EndOfBlock/>
			while(GlobalVariable.TRUE)																					//@<BlockInfo>jp.vstone.block.while.endless,400,224,1200,224,False,26,Endless@</BlockInfo>
			{

																														//@<OutputChild>
				CRobotUtil.Log(getClass().getSimpleName(), (String)"◆まち");												//@<BlockInfo>jp.vstone.block.printlog,464,224,464,224,False,23,@</BlockInfo>	@<EndOfBlock/>
				try{																									//@<BlockInfo>jp.vstone.block.tcpip.server,544,176,1120,176,False,22,@</BlockInfo>
					GlobalVariable.recvString = tcpipServer.waitRequest();

					if(GlobalVariable.recvString==null) GlobalVariable.recvString="";
					if(GlobalVariable.recvString.contentEquals((String)"End"))
					{
																														//@<OutputChild>
						CRobotUtil.Log(getClass().getSimpleName(), (String)GlobalVariable.recvString);						//@<BlockInfo>jp.vstone.block.printlog,608,176,608,176,False,9,@</BlockInfo>	@<EndOfBlock/>
						boolean varPresenEnd=false;																			//@<BlockInfo>jp.vstone.block.variable,672,176,672,176,False,8,break@</BlockInfo>
																															//@<EndOfBlock/>
						varPresenEnd=(boolean)endCall();																	//@<BlockInfo>jp.vstone.block.callfunc.base,736,176,736,176,False,7,@</BlockInfo>	@<EndOfBlock/>
						if(varPresenEnd==(boolean)true)																		//@<BlockInfo>jp.vstone.block.if,832,128,1008,128,False,6,コメント@</BlockInfo>
						{
																															//@<OutputChild>
							break;																							//@<BlockInfo>jp.vstone.block.break,912,128,912,128,False,5,break@</BlockInfo>	@<EndOfBlock/>
																															//@</OutputChild>
						}
						else
						{
																															//@<OutputChild>
																															//@</OutputChild>
						}
																															//@<EndOfBlock/>
																																//@</OutputChild>

					}
					else
					{
																														//@<OutputChild>
						String[] receiveStrAry=new String[3];																//@<BlockInfo>jp.vstone.block.variable,624,336,624,336,False,21,break@</BlockInfo>
																															//@<EndOfBlock/>
						CRobotUtil.Log(getClass().getSimpleName(), (String)GlobalVariable.recvString);						//@<BlockInfo>jp.vstone.block.printlog,688,336,688,336,False,20,@</BlockInfo>	@<EndOfBlock/>
						receiveStrAry=(String[])GlobalVariable.recvString.split(",",0);										//@<BlockInfo>jp.vstone.block.calculater,752,336,752,336,False,19,@</BlockInfo>
																															//@<EndOfBlock/>
						String varReceiveSpeechText=(String)receiveStrAry[2];												//@<BlockInfo>jp.vstone.block.variable,816,336,816,336,False,18,break@</BlockInfo>
																															//@<EndOfBlock/>
						String varReceiveMotionCd;																			//@<BlockInfo>jp.vstone.block.variable,880,336,880,336,False,17,break@</BlockInfo>
																															//@<EndOfBlock/>
						varReceiveMotionCd=(String)receiveStrAry[1];														//@<BlockInfo>jp.vstone.block.calculater,944,336,944,336,False,16,@</BlockInfo>
																															//@<EndOfBlock/>
						CRobotUtil.Log(getClass().getSimpleName(), (String)varReceiveSpeechText);							//@<BlockInfo>jp.vstone.block.printlog,1008,336,1008,336,False,15,@</BlockInfo>	@<EndOfBlock/>
						{																									//@<BlockInfo>jp.vstone.block.lock,624,432,944,432,False,14,関節のロック@</BlockInfo>
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
								selectMotion((String)varReceiveMotionCd);														//@<BlockInfo>jp.vstone.block.callfunc.base,688,432,688,432,False,12,@</BlockInfo>	@<EndOfBlock/>
								{																								//@<BlockInfo>jp.vstone.block.thread,752,432,880,432,False,11,スレッド@</BlockInfo>
									Thread th = new Thread(new Runnable() {
										@Override
										public void run() {
											try{
												
												
																																//@<OutputChild>
												GlobalVariable.sotawish.Say((String)varReceiveSpeechText,MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,816,432,816,432,False,10,@</BlockInfo>
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
						motionSpeeching((String)varReceiveMotionCd);														//@<BlockInfo>jp.vstone.block.callfunc.base,1024,432,1024,432,False,13,@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

					}
					
				} catch(Exception e) { }
																														//@<EndOfBlock/>
																														//@</OutputChild>
			}
																														//@<EndOfBlock/>
			pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,1280,224,1280,224,False,25,コメント@</BlockInfo>
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
			CRobotUtil.Log(getClass().getSimpleName(), (String)"◆ループ抜けました");											//@<BlockInfo>jp.vstone.block.printlog,1344,224,1344,224,False,24,@</BlockInfo>	@<EndOfBlock/>
																														//@</OutputChild>

			
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void selectMotion(String motionCd)																			//@<BlockInfo>jp.vstone.block.func,48,736,560,736,False,46,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		CRobotUtil.Log(getClass().getSimpleName(), (String)motionCd);													//@<BlockInfo>jp.vstone.block.printlog,112,736,112,736,False,45,@</BlockInfo>	@<EndOfBlock/>
		switch((String)motionCd)																						//@<BlockInfo>jp.vstone.block.switch,176,544,496,544,False,44,@</BlockInfo>
		{
			case (String)"001":
			{
																														//@<OutputChild>
				CRobotUtil.Log(getClass().getSimpleName(), (String)motionCd);												//@<BlockInfo>jp.vstone.block.printlog,240,544,240,544,False,33,@</BlockInfo>	@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,304,544,304,544,False,32,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{62,655,-33,688,777,463,-196,-9}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{255,0,0,0,255,0,0,255,0}
								);
				GlobalVariable.motion.play(pose,700);																		//@<EndOfBlock/>
																																//@</OutputChild>
				break;
			}
			case (String)"002":
			{
																														//@<OutputChild>
				CRobotUtil.Log(getClass().getSimpleName(), (String)motionCd);												//@<BlockInfo>jp.vstone.block.printlog,240,640,240,640,False,35,@</BlockInfo>	@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,304,640,304,640,False,34,コメント@</BlockInfo>
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
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,240,736,240,736,False,39,コメント@</BlockInfo>
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
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,304,736,304,736,False,38,コメント@</BlockInfo>
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
				CRobotUtil.wait((int)1500);																					//@<BlockInfo>jp.vstone.block.wait,368,736,368,736,False,37,コメント@</BlockInfo>	@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,432,736,432,736,False,36,コメント@</BlockInfo>
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
			case (String)"004":
			{
																														//@<OutputChild>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,240,832,240,832,False,41,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-1180,-798,2,-262,377,-554,-164,2}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,500);
				CRobotUtil.wait(500);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,304,832,304,832,False,40,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-757,-798,-504,-658,117,113,-44,-2}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,500);
				CRobotUtil.wait(500);																						//@<EndOfBlock/>
																																//@</OutputChild>
				break;
			}
			default:
			{
																														//@<OutputChild>
				CRobotUtil.Log(getClass().getSimpleName(), (String)"default通過");											//@<BlockInfo>jp.vstone.block.printlog,240,928,240,928,False,43,@</BlockInfo>	@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,304,928,304,928,False,42,コメント@</BlockInfo>
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

	//@<Separate/>
	public void startCall()																								//@<BlockInfo>jp.vstone.block.func,48,1120,768,1120,False,54,「終わりましょう」という声を認識したらTrueを戻す@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		while(GlobalVariable.TRUE)																						//@<BlockInfo>jp.vstone.block.while.endless,128,1120,688,1120,False,53,Endless@</BlockInfo>
		{

																														//@<OutputChild>
			recogresult = GlobalVariable.recog.getRecognitionwithAbort((int)60000);										//@<BlockInfo>jp.vstone.block.talk.speechrecog.regex2,208,1072,608,1072,False,52,音声認識を行い、結果を条件に正規表現文字列で比較する。認識スコアが一番高い結果に分岐する。実際に認識された文字列はspeechRecogResultに代入される@</BlockInfo>
			speechRecogResult = recogresult.CheckBest(new String[]{
			 ".*こんにちは.*" ,  "" , 
			},true);
			if(speechRecogResult == null) speechRecogResult = "";

			if(speechRecogResult.contains((String)".*こんにちは.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"みなさん、こんにちは！",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,288,1072,288,1072,False,51,@</BlockInfo>
																															//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,352,1072,352,1072,False,50,コメント@</BlockInfo>
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
					CRobotUtil.wait((int)3000);																				//@<BlockInfo>jp.vstone.block.wait,416,1072,416,1072,False,49,コメント@</BlockInfo>	@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"元気な挨拶をありがとうございます。これから発表を始めます。コマンドを実行してください。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,480,1072,480,1072,False,48,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,544,1072,544,1072,False,47,break@</BlockInfo>	@<EndOfBlock/>
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
	public void motionSpeeching(String motionCd)																		//@<BlockInfo>jp.vstone.block.func,720,736,1360,736,False,71,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		switch((String)motionCd)																						//@<BlockInfo>jp.vstone.block.switch,784,544,1296,544,False,70,@</BlockInfo>
		{
			case (String)"001":
			{
																														//@<OutputChild>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,848,544,848,544,False,57,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-378,-773,-1,722,-1,-3,-224,2}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,1200);
				CRobotUtil.wait(1200);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,912,544,912,544,False,56,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-625,-755,-699,688,776,-5,20,6}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,1000);
				CRobotUtil.wait(1000);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,976,544,976,544,False,55,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-378,-773,-1,722,-1,-3,-224,2}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,1000);
				CRobotUtil.wait(1000);																						//@<EndOfBlock/>
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
			case (String)"004":
			{
																														//@<OutputChild>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,848,832,848,832,False,62,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-378,-773,-1,722,-1,-3,-224,2}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,500);
				CRobotUtil.wait(500);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,912,832,912,832,False,61,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-375,155,-270,754,467,0,-18,0}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,500);
				CRobotUtil.wait(500);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,976,832,976,832,False,60,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-25,129,-89,744,470,0,-27,0}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,500);
				CRobotUtil.wait(500);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,1040,832,1040,832,False,59,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-375,155,-270,754,467,0,-18,0}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,500);
				CRobotUtil.wait(500);																						//@<EndOfBlock/>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,1104,832,1104,832,False,58,コメント@</BlockInfo>
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{-25,129,-89,744,470,0,-27,0}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,500);
				CRobotUtil.wait(500);																						//@<EndOfBlock/>
																																//@</OutputChild>
				break;
			}
			default:
			{
																														//@<OutputChild>
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,848,928,848,928,False,69,コメント@</BlockInfo>
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
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,912,928,912,928,False,68,コメント@</BlockInfo>
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
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,976,928,976,928,False,67,コメント@</BlockInfo>
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
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,1040,928,1040,928,False,66,コメント@</BlockInfo>
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
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,1104,928,1104,928,False,65,コメント@</BlockInfo>
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
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,1168,928,1168,928,False,64,コメント@</BlockInfo>
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
				pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,1232,928,1232,928,False,63,コメント@</BlockInfo>
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
	public boolean endCall()																							//@<BlockInfo>jp.vstone.block.func,48,1328,1264,1328,False,89,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		boolean varPresenEnd=false;																						//@<BlockInfo>jp.vstone.block.variable,112,1328,112,1328,False,88,break@</BlockInfo>
																														//@<EndOfBlock/>
		while(GlobalVariable.TRUE)																						//@<BlockInfo>jp.vstone.block.while.endless,192,1328,1136,1328,False,87,Endless@</BlockInfo>
		{

																														//@<OutputChild>
			recogresult = GlobalVariable.recog.getRecognitionwithAbort((int)60000);										//@<BlockInfo>jp.vstone.block.talk.speechrecog.regex2,272,1280,1040,1280,False,85,音声認識を行い、結果を条件に正規表現文字列で比較する。認識スコアが一番高い結果に分岐する。実際に認識された文字列はspeechRecogResultに代入される@</BlockInfo>
			speechRecogResult = recogresult.CheckBest(new String[]{
			 ".*終わりましょう.*" ,  "" , 
			},true);
			if(speechRecogResult == null) speechRecogResult = "";

			if(speechRecogResult.contains((String)".*終わりましょう.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,336,1280,336,1280,False,81,コメント@</BlockInfo>
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
					CRobotUtil.wait(500);																					//@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"プレゼンソータを終了します。ありがとうございました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,400,1280,400,1280,False,90,@</BlockInfo>
																															//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,464,1280,464,1280,False,80,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{-8,-904,-5,-485,263,2,-256,-6}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,500);
					CRobotUtil.wait(500);																					//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,528,1280,528,1280,False,79,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{-12,-907,-9,-491,537,-508,-255,-6}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,500);
					CRobotUtil.wait(500);																					//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,592,1280,592,1280,False,78,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{-8,-904,-5,-485,263,2,-256,-6}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,500);
					CRobotUtil.wait(500);																					//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,656,1280,656,1280,False,77,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{-12,-907,-9,-491,537,-508,-255,-6}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,500);
					CRobotUtil.wait(500);																					//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,720,1280,720,1280,False,76,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{-8,-904,-5,-485,263,2,-256,-6}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,500);
					CRobotUtil.wait(500);																					//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,784,1280,784,1280,False,75,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{-12,-907,-9,-491,537,-508,-255,-6}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,500);
					CRobotUtil.wait(500);																					//@<EndOfBlock/>
					pose = new CRobotPose();																				//@<BlockInfo>jp.vstone.block.pose,848,1280,848,1280,False,74,コメント@</BlockInfo>
					pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{0,-900,0,900,0,0,0,0}
									);
					pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
									new Short[]{100,100,100,100,100,100,100,100}
									);
					pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
									new Short[]{0,-255,0,180,80,0,180,80,0}
									);
					GlobalVariable.motion.play(pose,1500);
					CRobotUtil.wait(1500);																					//@<EndOfBlock/>
					varPresenEnd=(boolean)true;																				//@<BlockInfo>jp.vstone.block.calculater,912,1280,912,1280,False,73,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,976,1280,976,1280,False,72,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"プレゼンソータを続けます。次のコマンドを実行してください。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,400,1376,400,1376,False,84,@</BlockInfo>
																															//@<EndOfBlock/>
					varPresenEnd=(boolean)false;																			//@<BlockInfo>jp.vstone.block.calculater,912,1376,912,1376,False,83,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,976,1376,976,1376,False,82,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
																														//@<EndOfBlock/>
		return varPresenEnd;																							//@<BlockInfo>jp.vstone.block.return,1200,1328,1200,1328,False,86,return@</BlockInfo>	@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
