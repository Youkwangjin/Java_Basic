package study2.class3;

public class ClassStart2 {

    public static void main(String[] args) {
        // 객체 지향적 프로그래밍
        MusicPlayerData data = new MusicPlayerData();
        data.volume = 1;
        data.isOn = true;

        // 음악 플레이어 켜기
        soundOn(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 선택
        showStates(data);

        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void soundOn(MusicPlayerData data) {
        System.out.println("음악 플레이어를 시작합니다.");
        data.isOn = true;
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume ++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume --;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void showStates(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 ON");
        }
    }
}
