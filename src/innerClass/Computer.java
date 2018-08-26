package innerClass;


    public class Computer {
        class Processor {
            private boolean isStart = false;

            public void start() {
                isStart = true;
            }

            public void shutdown() {
                isStart = false;
            }

        }

        class RAM {
            private boolean isStart = false;

            public void start() {
                isStart = true;
            }

            public void shutdown() {
                isStart = false;
            }
        }


        Processor i5 = new Processor();//экземпляр процессора
        RAM kingstone = new RAM();//экземпляр оперативной памяти
    }