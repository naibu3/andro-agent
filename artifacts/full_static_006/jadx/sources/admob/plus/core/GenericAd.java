package admob.plus.core;

/* loaded from: classes.dex */
public interface GenericAd {
    default boolean isLoaded() {
        Helper.NOT_IMPLEMENTED();
        return false;
    }

    default void load(Context context) {
        Helper.NOT_IMPLEMENTED();
    }

    default void show(Context context) {
        Helper.NOT_IMPLEMENTED();
    }

    default void hide(Context context) {
        Helper.NOT_IMPLEMENTED();
    }
}
