package com.stripe.android.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.R;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CountryAdapter.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0019\u001a\u00020\bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0016J\u0012\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\bH\u0016J\"\u0010 \u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u000bH\u0016J\b\u0010$\u001a\u00020%H\u0016J\u001b\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0000¢\u0006\u0002\b+R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, d2 = {"Lcom/stripe/android/view/CountryAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/stripe/android/core/model/Country;", "context", "Landroid/content/Context;", "unfilteredCountries", "", "itemLayoutId", "", "textViewFactory", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Landroid/widget/TextView;", "<init>", "(Landroid/content/Context;Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "getUnfilteredCountries$payments_core_release", "()Ljava/util/List;", "setUnfilteredCountries$payments_core_release", "(Ljava/util/List;)V", "countryFilter", "Lcom/stripe/android/view/CountryAdapter$CountryFilter;", ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS, "firstItem", "getFirstItem$payments_core_release", "()Lcom/stripe/android/core/model/Country;", "getCount", "getItem", ContextChain.TAG_INFRA, "getPosition", "item", "getItemId", "", "getView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "viewGroup", "getFilter", "Landroid/widget/Filter;", "updateUnfilteredCountries", "", "allowedCountryCodes", "", "", "updateUnfilteredCountries$payments_core_release", "CountryFilter", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CountryAdapter extends ArrayAdapter<Country> {
    public static final int $stable = 8;
    private final CountryFilter countryFilter;
    private List<Country> suggestions;
    private final Function1<ViewGroup, TextView> textViewFactory;
    private List<Country> unfilteredCountries;

    public final List<Country> getUnfilteredCountries$payments_core_release() {
        return this.unfilteredCountries;
    }

    public final void setUnfilteredCountries$payments_core_release(List<Country> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.unfilteredCountries = list;
    }

    public /* synthetic */ CountryAdapter(Context context, List list, int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i2 & 4) != 0 ? R.layout.stripe_country_text_view : i, function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CountryAdapter(Context context, List<Country> unfilteredCountries, int i, Function1<? super ViewGroup, ? extends TextView> textViewFactory) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unfilteredCountries, "unfilteredCountries");
        Intrinsics.checkNotNullParameter(textViewFactory, "textViewFactory");
        this.unfilteredCountries = unfilteredCountries;
        this.textViewFactory = textViewFactory;
        this.countryFilter = new CountryFilter(this.unfilteredCountries, this, context instanceof Activity ? (Activity) context : null);
        this.suggestions = this.unfilteredCountries;
    }

    public final /* synthetic */ Country getFirstItem$payments_core_release() {
        return getItem(0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.suggestions.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Country getItem(int i) {
        return this.suggestions.get(i);
    }

    @Override // android.widget.ArrayAdapter
    public int getPosition(Country item) {
        return CollectionsKt.indexOf((List<? extends Country>) this.suggestions, item);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        return getItem(i).hashCode();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        TextView textViewInvoke = view instanceof TextView ? (TextView) view : this.textViewFactory.invoke(viewGroup);
        textViewInvoke.setText(getItem(i).getName());
        return textViewInvoke;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return this.countryFilter;
    }

    public final boolean updateUnfilteredCountries$payments_core_release(Set<String> allowedCountryCodes) {
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        if (allowedCountryCodes.isEmpty()) {
            return false;
        }
        List<Country> list = this.unfilteredCountries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CountryCode code = ((Country) obj).getCode();
            Set<String> set = allowedCountryCodes;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (StringsKt.equals((String) it.next(), code.getValue(), true)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        this.unfilteredCountries = arrayList2;
        this.countryFilter.setUnfilteredCountries(arrayList2);
        this.suggestions = this.unfilteredCountries;
        notifyDataSetChanged();
        return true;
    }

    /* compiled from: CountryAdapter.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u001c\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0014J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J \u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\bH\u0002R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/view/CountryAdapter$CountryFilter;", "Landroid/widget/Filter;", "unfilteredCountries", "", "Lcom/stripe/android/core/model/Country;", "adapter", "Lcom/stripe/android/view/CountryAdapter;", "activity", "Landroid/app/Activity;", "<init>", "(Ljava/util/List;Lcom/stripe/android/view/CountryAdapter;Landroid/app/Activity;)V", "getUnfilteredCountries", "()Ljava/util/List;", "setUnfilteredCountries", "(Ljava/util/List;)V", "activityRef", "Ljava/lang/ref/WeakReference;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "constraint", "", "publishResults", "", "filterResults", "filteredSuggestedCountries", "getSuggestedCountries", "isMatch", "", "countries", "hideKeyboard", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class CountryFilter extends Filter {
        private final WeakReference<Activity> activityRef;
        private final CountryAdapter adapter;
        private List<Country> unfilteredCountries;

        public final List<Country> getUnfilteredCountries() {
            return this.unfilteredCountries;
        }

        public final void setUnfilteredCountries(List<Country> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.unfilteredCountries = list;
        }

        public CountryFilter(List<Country> unfilteredCountries, CountryAdapter adapter, Activity activity) {
            Intrinsics.checkNotNullParameter(unfilteredCountries, "unfilteredCountries");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.unfilteredCountries = unfilteredCountries;
            this.adapter = adapter;
            this.activityRef = new WeakReference<>(activity);
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence constraint) {
            List<Country> listFilteredSuggestedCountries;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (constraint == null || (listFilteredSuggestedCountries = filteredSuggestedCountries(constraint)) == null) {
                listFilteredSuggestedCountries = this.unfilteredCountries;
            }
            filterResults.values = listFilteredSuggestedCountries;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence constraint, Filter.FilterResults filterResults) {
            Object obj = filterResults != null ? filterResults.values : null;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.stripe.android.core.model.Country>");
            List list = (List) obj;
            Activity activity = this.activityRef.get();
            if (activity != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Intrinsics.areEqual(((Country) it.next()).getName(), constraint)) {
                            hideKeyboard(activity);
                            break;
                        }
                    }
                }
            }
            this.adapter.suggestions = list;
            this.adapter.notifyDataSetChanged();
        }

        private final List<Country> filteredSuggestedCountries(CharSequence constraint) {
            List<Country> suggestedCountries = getSuggestedCountries(constraint);
            return (suggestedCountries.isEmpty() || isMatch(suggestedCountries, constraint)) ? this.unfilteredCountries : suggestedCountries;
        }

        private final List<Country> getSuggestedCountries(CharSequence constraint) {
            List<Country> list = this.unfilteredCountries;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String lowerCase = ((Country) obj).getName().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String lowerCase2 = String.valueOf(constraint).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (StringsKt.startsWith$default(lowerCase, lowerCase2, false, 2, (Object) null)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        private final boolean isMatch(List<Country> countries, CharSequence constraint) {
            return countries.size() == 1 && Intrinsics.areEqual(countries.get(0).getName(), String.valueOf(constraint));
        }

        private final void hideKeyboard(Activity activity) {
            Object systemService = activity.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager == null || !inputMethodManager.isAcceptingText()) {
                return;
            }
            View currentFocus = activity.getCurrentFocus();
            inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
        }
    }
}
