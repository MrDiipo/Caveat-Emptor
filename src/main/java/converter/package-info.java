
@org.hibernate.annotations.TypeDefs({
        @org.hibernate.annotations.TypeDef(
                name = "monetary_amount_usd",
                typeClass = MonetaryAmountUserType.class,
                parameters = {@Parameter(name = "convertTo", value = "USD")}
        ), @org.hibernate.annotations.TypeDef(
        name = "monetary_amount_eur",
        typeClass = MonetaryAmountUserType.class,
        parameters = {@Parameter(name = "converTo", value = "EUR")}
        )
                })
package converter;

import org.hibernate.annotations.Parameter;

