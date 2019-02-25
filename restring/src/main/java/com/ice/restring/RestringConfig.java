package com.ice.restring;

/**
 * Contains configuration properties for initializing Restring.
 */
public class RestringConfig {

    private boolean persist;
    private boolean initSyncronously;
    private Restring.StringsLoader stringsLoader;

    public boolean isPersist() {
        return persist;
    }

    public boolean shouldInitSynchronously() {
        return initSyncronously;
    }

    public Restring.StringsLoader getStringsLoader() {
        return stringsLoader;
    }

    private RestringConfig() {
    }

    public static class Builder {
        private boolean persist;
        private boolean initSyncronously;
        private Restring.StringsLoader stringsLoader;

        public Builder persist(boolean persist) {
            this.persist = persist;
            return this;
        }

        public Builder initSyncronously(boolean initSyncronously) {
            this.initSyncronously = initSyncronously;
            return this;
        }

        public Builder stringsLoader(Restring.StringsLoader loader) {
            this.stringsLoader = loader;
            return this;
        }

        public RestringConfig build() {
            RestringConfig config = new RestringConfig();
            config.persist = persist;
            config.initSyncronously = initSyncronously;
            config.stringsLoader = stringsLoader;
            return config;
        }
    }

    static RestringConfig getDefault() {
        return new Builder()
                .persist(true)
                .initSyncronously(false)
                .build();
    }
}