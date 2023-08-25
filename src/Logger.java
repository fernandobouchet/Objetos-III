public class Logger {
    private enum nivelesLogger {INFO, WARN, ERROR};

    private nivelesLogger loggerActual;

    public Logger(String nivelLogger) {
        if(nivelLogger.equalsIgnoreCase("INFO")) {
            loggerActual = nivelesLogger.INFO;
        } else if (nivelLogger.equalsIgnoreCase("WARN")) {
            loggerActual = nivelesLogger.WARN;
        } else if (nivelLogger.equalsIgnoreCase("ERROR")) {
            loggerActual = nivelesLogger.ERROR;
        } else {
            throw new Error("No es posible asignar el nivel de logger indicado");
        }
    }

    public void showInfo(String message) {
        if(loggerActual != nivelesLogger.INFO) return;
        System.out.println("INFO: " + message);
    }

    public void showWarn(String message) {
        if(loggerActual == nivelesLogger.ERROR) return;
        System.out.println("WARN: " + message);
    }

    public void showError(String message) {
        System.out.println("ERROR: " + message);
    }
}
