package com.dzinevich.ssm.domain;

public enum PaymentEvent {
    PRE_AUTHORIZE,
    PRE_AUTHORIZE_APPROVED,
    PRE_AUTHORIZE_DECLINED,
    AUTHORIZE,
    AUTHORIZE_APPROVED,
    AUTHORIZE_DECLINED;
}
