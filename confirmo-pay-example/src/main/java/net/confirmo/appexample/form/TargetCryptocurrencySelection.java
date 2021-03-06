package net.confirmo.appexample.form;

import net.confirmo.api.model.Currency;

public enum TargetCryptocurrencySelection {
    BTC(Currency.BTC),
    LTC(Currency.LTC),
    CHOOSE_LATER(null);

    private Currency currency;

    TargetCryptocurrencySelection(Currency currency) {
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }
}
