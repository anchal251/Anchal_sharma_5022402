

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light("Light-1");
        remoteControl.executeCommand(new LightOffCommand(light));
        System.out.println(light.getLightStatus());
        remoteControl.executeCommand(new LightOnCommand(light));
        System.out.println(light.getLightStatus());
    }
}