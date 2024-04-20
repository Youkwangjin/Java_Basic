package study2.class3;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void soundOn() {
        System.out.println("음악 플레이어를 시작합니다.");
        isOn = true;
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    void showStates() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 ON");
        }
    }
}
