package TP.Logger;

public class LogReason {
    public static class NEW_WORKER extends LogReason {
        public NEW_WORKER() {

        }
    }

    public static class NEW_TREE extends LogReason {
        public NEW_TREE() {

        }
    }

    public static class DENIED_ACCESS extends LogReason {
        public DENIED_ACCESS() {

        }
    }

    public static class ALLOWED_ACCESS_TO {
        public static class ADMIN_AREA extends LogReason {
            public ADMIN_AREA() {

            }
        }

        public static class DATA_LISTERS extends LogReason {
            public DATA_LISTERS() {

            }
        }

        public static class LOGGING_DATA extends LogReason {
            public LOGGING_DATA() {

            }
        }
    }
}
