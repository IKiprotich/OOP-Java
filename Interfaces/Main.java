// Interface for Speaker
interface Speaker {
    void sound();  // Implicitly public and abstract
}

// Preacher class implementing Speaker
class Preacher implements Speaker {
    @Override // we must overided because it is an abstract method
    public void sound() {
        System.out.println("Preacher delivers a sermon.");
    }
}

// Politician class implementing Speaker
class Politician implements Speaker {
    @Override
    public void sound() {
        System.out.println("Politician gives a speech.");
    }
}

// Singer class implementing Speaker
class Singer implements Speaker {
    @Override
    public void sound() {
        System.out.println("Singer performs a song.");
    }
}

// Interface for Phone
interface Phone {
    void call();
    void sendText();
    void takePicture();
    void recordVideo();
    void playMusic();
    void playVideo();
    void browseInternet();
    void useGPS();
    void useBluetooth();
}

// iPhone class implementing Phone
class iPhone implements Phone {
    @Override
    public void call() {
        System.out.println("iPhone makes a call.");
    }

    @Override
    public void sendText() {
        System.out.println("iPhone sends a text.");
    }

    @Override
    public void takePicture() {
        System.out.println("iPhone takes a picture.");
    }

    @Override
    public void recordVideo() {
        System.out.println("iPhone records a video.");
    }

    @Override
    public void playMusic() {
        System.out.println("iPhone plays music.");
    }

    @Override
    public void playVideo() {
        System.out.println("iPhone plays a video.");
    }

    @Override
    public void browseInternet() {
        System.out.println("iPhone browses the internet.");
    }

    @Override
    public void useGPS() {
        System.out.println("iPhone uses GPS.");
    }

    @Override
    public void useBluetooth() {
        System.out.println("iPhone uses Bluetooth.");
    }
}

// FeaturePhone class implementing Phone
class FeaturePhone implements Phone {
    @Override
    public void call() {
        System.out.println("FeaturePhone makes a call.");
    }

    @Override
    public void sendText() {
        System.out.println("FeaturePhone sends a text.");
    }

    @Override
    public void takePicture() {
        System.out.println("FeaturePhone takes a picture.");
    }

    @Override
    public void recordVideo() {
        System.out.println("FeaturePhone records a video.");
    }

    @Override
    public void playMusic() {
        System.out.println("FeaturePhone plays music.");
    }

    @Override
    public void playVideo() {
        System.out.println("FeaturePhone plays a video.");
    }

    @Override
    public void browseInternet() {
        System.out.println("FeaturePhone browses the internet.");
    }

    @Override
    public void useGPS() {
        System.out.println("FeaturePhone uses GPS.");
    }

    @Override
    public void useBluetooth() {
        System.out.println("FeaturePhone uses Bluetooth.");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Test Speaker implementations
        Speaker preacher = new Preacher();
        preacher.sound();  // "Preacher delivers a sermon."

        Speaker politician = new Politician();
        politician.sound();  // "Politician gives a speech."

        Speaker singer = new Singer();
        singer.sound();  // "Singer performs a song."

        // Test Phone implementations
        Phone iphone = new iPhone();
        iphone.call();        // "iPhone makes a call."
        iphone.takePicture(); // "iPhone takes a picture."

        Phone featurePhone = new FeaturePhone();
        featurePhone.sendText(); // "FeaturePhone sends a text."
    }
}
