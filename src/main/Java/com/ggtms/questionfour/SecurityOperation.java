package com.ggtms.questionfour;

/**
 * @author ggtms
 * @ 2020-08-12 22:59
 */
public class SecurityOperation{

    private static Camera camera1 = new Camera();
    private static Camera camera2 = new Camera();
    private static Door door1 = new Door();
    private static Door door2 = new Door();
    private static Ligth ligth1 = new Ligth();
    private static Ligth ligth2 = new Ligth();

    /**
     * 上午的上班操作
     */
    public void morningOpen(){
        camera1.openCamera();
        camera2.openCamera();
        door1.openDoor();
        door2.openDoor();
        ligth1.openLight();
        ligth2.openLight();
    }

    /**
     * 下午的关闭操作
     */
    public void eveningClose(){
        camera1.closeCamera();
        camera2.closeCamera();
        door1.closeDoor();
        door2.closeDoor();
        ligth1.closeLight();
        ligth2.closeLight();
    }

}
