package study2;

public class ClassMain1 {

    public static void main(String[] args) {

        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.volumeDown();

        speaker.showVolume();

        /**
         * 필드에 직접 접근해서 값을 다시 초기화 (접근 제어자를 지정하지 않았기에 가능)
         * Speaker 클래스에 기능(메서드)에 볼륨이 100이 넘어가지 못하게 설정했지만 소용이 없어짐
         * 따라서 이런 이슈를 방지하기 위헤 접근제어자를 사용한다.
         */
        // speaker.volume = 200; private 접근제어자 추가

    }
}
