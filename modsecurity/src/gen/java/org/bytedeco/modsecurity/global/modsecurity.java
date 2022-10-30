// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity.global;

import org.bytedeco.modsecurity.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

public class modsecurity extends org.bytedeco.modsecurity.presets.modsecurity {
    static { Loader.load(); }

// Targeting ../StringList.java


// Targeting ../RuleMessageList.java


// Targeting ../StringSet.java


// Parsed from modsecurity/intervention.h

/*
 * ModSecurity, http://www.modsecurity.org/
 * Copyright (c) 2015 - 2021 Trustwave Holdings, Inc. (http://www.trustwave.com/)
 *
 * You may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * If any of the files related to licensing are missing or if you have any
 * other questions related to licensing please contact Trustwave Holdings, Inc.
 * directly using the email address security@modsecurity.org.
 *
 */

// #ifndef HEADERS_MODSECURITY_INTERVENTION_H_
// #define HEADERS_MODSECURITY_INTERVENTION_H_

// #ifdef __cplusplus
// Targeting ../ModSecurityIntervention.java



// #ifdef __cplusplus
    @Namespace("modsecurity::intervention") @NoException public static native void reset(ModSecurityIntervention i);

    @Namespace("modsecurity::intervention") @NoException public static native void clean(ModSecurityIntervention i);

    @Namespace("modsecurity::intervention") @NoException public static native void freeUrl(ModSecurityIntervention i);

    @Namespace("modsecurity::intervention") @NoException public static native void freeLog(ModSecurityIntervention i);

    @Namespace("modsecurity::intervention") @NoException public static native @Name("free") void _free(ModSecurityIntervention i);

  // namespace intervention
// #endif

// #ifdef __cplusplus
  // namespace modsecurity
// #endif

// #endif  // HEADERS_MODSECURITY_INTERVENTION_H_


// Parsed from modsecurity/audit_log.h

/*
 * ModSecurity, http://www.modsecurity.org/
 * Copyright (c) 2015 - 2021 Trustwave Holdings, Inc. (http://www.trustwave.com/)
 *
 * You may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * If any of the files related to licensing are missing or if you have any
 * other questions related to licensing please contact Trustwave Holdings, Inc.
 * directly using the email address security@modsecurity.org.
 *
 */

// #ifdef __cplusplus
// #include <iostream>
// #include <fstream>
// #include <string>
// #endif

// #ifndef HEADERS_MODSECURITY_AUDIT_LOG_H_
// #define HEADERS_MODSECURITY_AUDIT_LOG_H_
// Targeting ../Writer.java



// Targeting ../AuditLog.java




  // namespace audit_log
  // namespace modsecurity
// #endif

// #endif  // HEADERS_MODSECURITY_AUDIT_LOG_H_


// Parsed from modsecurity/debug_log.h

/*
 * ModSecurity, http://www.modsecurity.org/
 * Copyright (c) 2015 - 2021 Trustwave Holdings, Inc. (http://www.trustwave.com/)
 *
 * You may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * If any of the files related to licensing are missing or if you have any
 * other questions related to licensing please contact Trustwave Holdings, Inc.
 * directly using the email address security@modsecurity.org.
 *
 */

// #ifdef __cplusplus
// #include <string>
// #endif

// #ifndef HEADERS_MODSECURITY_DEBUG_LOG_H_
// #define HEADERS_MODSECURITY_DEBUG_LOG_H_


// #ifndef __cplusplus
// #endif

// #ifdef __cplusplus
// Targeting ../DebugLog.java




  // namespace debug_log
  // namespace modsecurity
// #endif

// #endif  // HEADERS_MODSECURITY_DEBUG_LOG_H_


// Parsed from modsecurity/intervention.h

/*
 * ModSecurity, http://www.modsecurity.org/
 * Copyright (c) 2015 - 2021 Trustwave Holdings, Inc. (http://www.trustwave.com/)
 *
 * You may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * If any of the files related to licensing are missing or if you have any
 * other questions related to licensing please contact Trustwave Holdings, Inc.
 * directly using the email address security@modsecurity.org.
 *
 */

// #ifndef HEADERS_MODSECURITY_INTERVENTION_H_
// #define HEADERS_MODSECURITY_INTERVENTION_H_

// #ifdef __cplusplus
// #endif

// #ifdef __cplusplus

  // namespace intervention
// #endif

// #ifdef __cplusplus
  // namespace modsecurity
// #endif

// #endif  // HEADERS_MODSECURITY_INTERVENTION_H_


// Parsed from modsecurity/rule_message.h

/*
 * ModSecurity, http://www.modsecurity.org/
 * Copyright (c) 2015 - 2021 Trustwave Holdings, Inc. (http://www.trustwave.com/)
 *
 * You may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * If any of the files related to licensing are missing or if you have any
 * other questions related to licensing please contact Trustwave Holdings, Inc.
 * directly using the email address security@modsecurity.org.
 *
 */

// #ifdef __cplusplus
// #include <stack>
// #include <vector>
// #include <string>
// #include <list>
// #include <cstring>
// #endif

// #ifndef HEADERS_MODSECURITY_RULE_MESSAGE_H_
// #define HEADERS_MODSECURITY_RULE_MESSAGE_H_

// #include "modsecurity/transaction.h"
// #include "modsecurity/rule.h"
// #include "modsecurity/rule_with_operator.h"
// Targeting ../RuleMessage.java




  // namespace modsecurity
// #endif


// #endif  // HEADERS_MODSECURITY_RULE_MESSAGE_H_


// Parsed from modsecurity/rules_set.h

/*
 * ModSecurity, http://www.modsecurity.org/
 * Copyright (c) 2015 - 2021 Trustwave Holdings, Inc. (http://www.trustwave.com/)
 *
 * You may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * If any of the files related to licensing are missing or if you have any
 * other questions related to licensing please contact Trustwave Holdings, Inc.
 * directly using the email address security@modsecurity.org.
 *
 */

// #include <stdio.h>
// #include <string.h>

// #ifdef __cplusplus
// #include <ctime>
// #include <iostream>
// #include <string>
// #include <vector>
// #include <list>
// #endif


// #ifndef HEADERS_MODSECURITY_RULES_SET_H_
// #define HEADERS_MODSECURITY_RULES_SET_H_

// #include "modsecurity/rules_set_properties.h"
// #include "modsecurity/modsecurity.h"
// #include "modsecurity/transaction.h"
// #include "modsecurity/rule.h"
// #include "modsecurity/rules_set_phases.h"
// Targeting ../RuleWithOperator.java


// Targeting ../Driver.java



// Targeting ../RulesSet.java



// #endif

// #ifdef __cplusplus
// #endif

@Namespace("modsecurity") public static native RulesSet msc_create_rules_set();
@Namespace("modsecurity") public static native void msc_rules_dump(RulesSet rules);
@Namespace("modsecurity") public static native int msc_rules_merge(RulesSet rules_dst, RulesSet rules_from, @Cast("const char**") PointerPointer error);
@Namespace("modsecurity") public static native int msc_rules_merge(RulesSet rules_dst, RulesSet rules_from, @Cast("const char**") @ByPtrPtr BytePointer error);
@Namespace("modsecurity") public static native int msc_rules_merge(RulesSet rules_dst, RulesSet rules_from, @Cast("const char**") @ByPtrPtr ByteBuffer error);
@Namespace("modsecurity") public static native int msc_rules_merge(RulesSet rules_dst, RulesSet rules_from, @Cast("const char**") @ByPtrPtr byte[] error);
@Namespace("modsecurity") public static native int msc_rules_add_remote(RulesSet rules, @Cast("const char*") BytePointer key, @Cast("const char*") BytePointer uri,
    @Cast("const char**") PointerPointer error);
@Namespace("modsecurity") public static native int msc_rules_add_remote(RulesSet rules, @Cast("const char*") BytePointer key, @Cast("const char*") BytePointer uri,
    @Cast("const char**") @ByPtrPtr BytePointer error);
@Namespace("modsecurity") public static native int msc_rules_add_remote(RulesSet rules, String key, String uri,
    @Cast("const char**") @ByPtrPtr ByteBuffer error);
@Namespace("modsecurity") public static native int msc_rules_add_remote(RulesSet rules, @Cast("const char*") BytePointer key, @Cast("const char*") BytePointer uri,
    @Cast("const char**") @ByPtrPtr byte[] error);
@Namespace("modsecurity") public static native int msc_rules_add_remote(RulesSet rules, String key, String uri,
    @Cast("const char**") @ByPtrPtr BytePointer error);
@Namespace("modsecurity") public static native int msc_rules_add_remote(RulesSet rules, @Cast("const char*") BytePointer key, @Cast("const char*") BytePointer uri,
    @Cast("const char**") @ByPtrPtr ByteBuffer error);
@Namespace("modsecurity") public static native int msc_rules_add_remote(RulesSet rules, String key, String uri,
    @Cast("const char**") @ByPtrPtr byte[] error);
@Namespace("modsecurity") public static native int msc_rules_add_file(RulesSet rules, @Cast("const char*") BytePointer file, @Cast("const char**") PointerPointer error);
@Namespace("modsecurity") public static native int msc_rules_add_file(RulesSet rules, @Cast("const char*") BytePointer file, @Cast("const char**") @ByPtrPtr BytePointer error);
@Namespace("modsecurity") public static native int msc_rules_add_file(RulesSet rules, String file, @Cast("const char**") @ByPtrPtr ByteBuffer error);
@Namespace("modsecurity") public static native int msc_rules_add_file(RulesSet rules, @Cast("const char*") BytePointer file, @Cast("const char**") @ByPtrPtr byte[] error);
@Namespace("modsecurity") public static native int msc_rules_add_file(RulesSet rules, String file, @Cast("const char**") @ByPtrPtr BytePointer error);
@Namespace("modsecurity") public static native int msc_rules_add_file(RulesSet rules, @Cast("const char*") BytePointer file, @Cast("const char**") @ByPtrPtr ByteBuffer error);
@Namespace("modsecurity") public static native int msc_rules_add_file(RulesSet rules, String file, @Cast("const char**") @ByPtrPtr byte[] error);
@Namespace("modsecurity") public static native int msc_rules_add(RulesSet rules, @Cast("const char*") BytePointer plain_rules, @Cast("const char**") PointerPointer error);
@Namespace("modsecurity") public static native int msc_rules_add(RulesSet rules, @Cast("const char*") BytePointer plain_rules, @Cast("const char**") @ByPtrPtr BytePointer error);
@Namespace("modsecurity") public static native int msc_rules_add(RulesSet rules, String plain_rules, @Cast("const char**") @ByPtrPtr ByteBuffer error);
@Namespace("modsecurity") public static native int msc_rules_add(RulesSet rules, @Cast("const char*") BytePointer plain_rules, @Cast("const char**") @ByPtrPtr byte[] error);
@Namespace("modsecurity") public static native int msc_rules_add(RulesSet rules, String plain_rules, @Cast("const char**") @ByPtrPtr BytePointer error);
@Namespace("modsecurity") public static native int msc_rules_add(RulesSet rules, @Cast("const char*") BytePointer plain_rules, @Cast("const char**") @ByPtrPtr ByteBuffer error);
@Namespace("modsecurity") public static native int msc_rules_add(RulesSet rules, String plain_rules, @Cast("const char**") @ByPtrPtr byte[] error);
@Namespace("modsecurity") public static native int msc_rules_cleanup(RulesSet rules);

// #ifdef __cplusplus
  // namespace modsecurity
// #endif

// #endif  // HEADERS_MODSECURITY_RULES_SET_H_


// Parsed from modsecurity/rules_set_phases.h


/*
 * ModSecurity, http://www.modsecurity.org/
 * Copyright (c) 2015 - 2021 Trustwave Holdings, Inc. (http://www.trustwave.com/)
 *
 * You may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * If any of the files related to licensing are missing or if you have any
 * other questions related to licensing please contact Trustwave Holdings, Inc.
 * directly using the email address security@modsecurity.org.
 *
 */

// #include <stdio.h>
// #include <string.h>

// #ifdef __cplusplus
// #include <ctime>
// #include <iostream>
// #include <string>
// #include <vector>
// #include <list>
// #endif


// #ifndef HEADERS_MODSECURITY_RULES_SET_PHASES_H_
// #define HEADERS_MODSECURITY_RULES_SET_PHASES_H_

// #include "modsecurity/rules.h"

// #ifdef __cplusplus

// Targeting ../RulesSetPhases.java




  // namespace modsecurity
// #endif

// #endif  // HEADERS_MODSECURITY_RULES_SET_PHASES_H_

// Parsed from modsecurity/rules_set_properties.h

/*
 * ModSecurity, http://www.modsecurity.org/
 * Copyright (c) 2015 - 2021 Trustwave Holdings, Inc. (http://www.trustwave.com/)
 *
 * You may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * If any of the files related to licensing are missing or if you have any
 * other questions related to licensing please contact Trustwave Holdings, Inc.
 * directly using the email address security@modsecurity.org.
 *
 */


// #ifdef __cplusplus
// #include <ctime>
// #include <iostream>
// #include <string>
// #include <vector>
// #include <list>
// #include <set>
// #include <cstring>
// #endif


// #ifndef HEADERS_MODSECURITY_RULES_SET_PROPERTIES_H_
// #define HEADERS_MODSECURITY_RULES_SET_PROPERTIES_H_


// #include "modsecurity/modsecurity.h"
// #include "modsecurity/rule.h"
// #include "modsecurity/rules_exceptions.h"
// #include "modsecurity/actions/action.h"
// #include "modsecurity/audit_log.h"

public static final String CODEPAGE_SEPARATORS =  " \t\n\r";

// #define merge_boolean_value(to, from, default)
//     if (to == PropertyNotSetConfigBoolean) {
//         to = (from == PropertyNotSetConfigBoolean) ? default : from;
//     }

// #define merge_ruleengine_value(to, from, default)
//     if (to == PropertyNotSetRuleEngine) {
//         to = (from == PropertyNotSetRuleEngine) ? default : from;
//     }

// #define merge_bodylimitaction_value(to, from, default)
//     if (to == PropertyNotSetBodyLimitAction) {
//         to = (from == PropertyNotSetBodyLimitAction) ? default : from;
//     }
// Targeting ../RulesExceptions.java



// Targeting ../ConfigInt.java


// Targeting ../ConfigDouble.java


// Targeting ../ConfigString.java


// Targeting ../ConfigSet.java


// Targeting ../UnicodeMapHolder.java


// Targeting ../ConfigUnicodeMap.java


// Targeting ../RulesSetProperties.java




// #endif

// #ifdef __cplusplus
  // namespace modsecurity
// #endif

// #endif  // HEADERS_MODSECURITY_RULES_SET_PROPERTIES_H_


// Parsed from modsecurity/collection/collection.h

/*
 * ModSecurity, http://www.modsecurity.org/
 * Copyright (c) 2015 - 2021 Trustwave Holdings, Inc. (http://www.trustwave.com/)
 *
 * You may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * If any of the files related to licensing are missing or if you have any
 * other questions related to licensing please contact Trustwave Holdings, Inc.
 * directly using the email address security@modsecurity.org.
 *
 */


// #ifdef __cplusplus
// #include <string>
// #include <iostream>
// #include <unordered_map>
// #include <list>
// #include <vector>
// #include <algorithm>
// #include <memory>
// #endif


// #include "modsecurity/variable_value.h"


// #ifndef HEADERS_MODSECURITY_COLLECTION_COLLECTION_H_
// #define HEADERS_MODSECURITY_COLLECTION_COLLECTION_H_
// Targeting ../Variables.java


// Targeting ../KeyExclusions.java



// Targeting ../Collection.java



  // namespace collection
  // namespace modsecurity
// #endif


// #endif  // HEADERS_MODSECURITY_COLLECTION_COLLECTION_H_


// Parsed from modsecurity/modsecurity.h

/*
 * ModSecurity, http://www.modsecurity.org/
 * Copyright (c) 2015 - 2021 Trustwave Holdings, Inc. (http://www.trustwave.com/)
 *
 * You may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * If any of the files related to licensing are missing or if you have any
 * other questions related to licensing please contact Trustwave Holdings, Inc.
 * directly using the email address security@modsecurity.org.
 *
 */

/** \file modsecurity.h Main ModSecurity header file */

/** \mainpage ModSecurity - open source, cross platform web application firewall
 *
 * Example Usage:
 * <pre>{@code
 *
 * using ModSecurity::ModSecurity;
 * using ModSecurity::Rules;
 * using ModSecurity::Transaction;
 *
 * ModSecurity *modsec;
 * ModSecurity::Rules *rules;
 *
 * modsec = new ModSecurity();
 * rules = new Rules();
 * rules->loadFromUri(rules_file);
 *
 * Transaction *modsecTransaction = new Transaction(modsec, rules);
 * modsecTransaction->processConnection("127.0.0.1");
 *
 * if (modsecTransaction->intervention()) {
 *     std::cout << "There is an intervention" << std::endl;
 * }
 *
 * ...      
 *
 * }</pre>
 * 
 */

/**
 * \defgroup ModSecurity_C_API ModSecurity C API
 *
 * This is the ModSecurity C API description
 *
 * At this page you can get information on how the extend your C
 * application, by embedding ModSecurity.
 *
 */


/**
 * \defgroup ModSecurity_CPP_API ModSecurity CPP API
 *
 * This is the ModSecurity CPP API description.
 *
 * At this page you can get information on how the extend your CPP
 * application, by embedding ModSecurity.
 *
 */


/**
 * \defgroup ModSecurity_Operator ModSecurity Operators
 *
 * SecLanguage operator
 */


// #ifdef __cplusplus
// #include <ctime>
// #include <iostream>
// #include <string>
// #include <memory>
// #endif


// #ifndef HEADERS_MODSECURITY_MODSECURITY_H_
// #define HEADERS_MODSECURITY_MODSECURITY_H_


// #ifndef __cplusplus
// #else
    /**
     *
     * The Phases enumerator consists in mapping the different stages of a
     * given request. ModSecurity is expected to inspect data based on those
     * "phases". If your module/application use this in a different order, it
     * will lead ModSecurity to act in an unexpected behavior.
     *
     * It is mandatory to call all the phases, even if you don't have this
     * phases segmented in your end.
     *
     */
    /** enum modsecurity::Phases */
    public static final int
    /**
     *
     * The connection is the very first information that ModSecurity can
     * inspect. It is expected to happens before the virtual host name be
     * resolved. This phase is expected to happen immediately after a
     * connection is established.
     *
     */
     ConnectionPhase = 0,
    /**
     *
     * The "URI" phase happens just after the web server (or any other
     * application that you may use with ModSecurity) have the acknowledgement
     * of the full request URI.
     *
     */
     UriPhase = 1,
    /**
     *
     * The "RequestHeaders" phase happens when the server has all the
     * information about the headers. Notice however, that it is expected to
     * happen prior to the reception of the request body (if any).
     *
     */
     RequestHeadersPhase = 2,
    /**
     *
     * At the "RequestHeaders" phase, ModSecurity is expected to inspect the
     * content of a request body, that does not happens when the server has all
     * the content but prior to that, when the body transmission started.
     * ModSecurity can ask the webserver to block (or make any other disruptive
     * action) while the client is still transmitting the data.
     *
     */
     RequestBodyPhase = 3,
    /**
     *
     * The "ResponseHeaders" happens just before all the response headers are
     * ready to be delivery to the client.
     *
     */
     ResponseHeadersPhase = 4,
    /**
     *
     * Same as "RequestBody" the "ResponseBody" phase perform a stream
     * inspection which may result in a disruptive action.
     *
     */
     ResponseBodyPhase = 5,
    /**
     *
     * The last phase is the logging phase. At this phase ModSecurity will
     * generate the internal logs, there is no need to hold the request at
     * this point as this phase does not produce any kind of action.
     *
     */
     LoggingPhase = 6,
    /**
     * Just a marking for the expected number of phases.
     * 
     */
     NUMBER_OF_PHASES = 7;


  // namespace modsecurity
// #endif



// #include "modsecurity/intervention.h"
// #include "modsecurity/transaction.h"
// #include "modsecurity/debug_log.h"

/**
 * TAG_NUM:
 *
 * Alpha  - 001
 * Beta   - 002
 * Dev    - 010
 * Rc1    - 051
 * Rc2    - 052
 * ...    - ...
 * Release- 100
 *
 */

public static final String MODSECURITY_MAJOR = "3";
public static final String MODSECURITY_MINOR = "0";
public static final String MODSECURITY_PATCHLEVEL = "8";
public static final String MODSECURITY_TAG = "";
public static final String MODSECURITY_TAG_NUM = "100";

public static final String MODSECURITY_VERSION = MODSECURITY_MAJOR +  "." +  
    MODSECURITY_MINOR +  "." +  MODSECURITY_PATCHLEVEL +  
    MODSECURITY_TAG;

public static final int MODSECURITY_VERSION_NUM = 3080100;

// #define MODSECURITY_CHECK_VERSION(a) (MODSECURITY_VERSION_NUM <= a)
// Targeting ../ModSecLogCb.java




// #ifdef __cplusplus
// Targeting ../Action.java




// #ifdef __cplusplus
// #endif
    /**
     *
     * Properties used to configure the general log callback.
     *
     */
    /** enum modsecurity::LogProperty */
    public static final int
    /**
     *
     * Original ModSecurity text log entry. The same entry that can be found
     * within the Apache error_log (in the 2.x family)
     *
     */
     TextLogProperty = 1,
    /**
     *
     * Instead of return the text log entry an instance of the class
     * RuleMessages is returned.
     *
     */
     RuleMessageLogProperty = 2,
    /**
     * This property only makes sense with the utilization of the
     * RuleMessageLogProperty. Without this property set the RuleMessage
     * structure will not be filled with the information of the hightlight.
     *
     * Notice that the highlight can be calculate post-analisys. Calculate it
     * during the analisys may delay the analisys process.
     *
    */
     IncludeFullHighlightLogProperty = 4;


// #ifdef __cplusplus
// Targeting ../ModSecurity.java




// #endif

// #ifdef __cplusplus
// #endif

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native ModSecurity msc_init();
/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native @Cast("const char*") BytePointer msc_who_am_i(ModSecurity msc);
/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native void msc_set_connector_info(ModSecurity msc, @Cast("const char*") BytePointer connector);
@Namespace("modsecurity") public static native void msc_set_connector_info(ModSecurity msc, String connector);
/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native void msc_set_log_cb(ModSecurity msc, ModSecLogCb cb);
/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native void msc_cleanup(ModSecurity msc);

// #ifdef __cplusplus


  // namespace modsecurity
// #endif

// #endif  // HEADERS_MODSECURITY_MODSECURITY_H_


// Parsed from modsecurity/transaction.h

/*
 * ModSecurity, http://www.modsecurity.org/
 * Copyright (c) 2015 - 2021 Trustwave Holdings, Inc. (http://www.trustwave.com/)
 *
 * You may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * If any of the files related to licensing are missing or if you have any
 * other questions related to licensing please contact Trustwave Holdings, Inc.
 * directly using the email address security@modsecurity.org.
 *
 */

// #ifdef __cplusplus
// #include <ctime>
// #include <fstream>
// #include <iomanip>
// #include <iostream>
// #include <list>
// #include <map>
// #include <sstream>
// #include <string>
// #include <unordered_map>
// #include <utility>
// #include <vector>
// #include <memory>
// #include <stack>
// #endif

// #include <stdlib.h>
// #include <stddef.h>

// #ifndef HEADERS_MODSECURITY_TRANSACTION_H_
// #define HEADERS_MODSECURITY_TRANSACTION_H_

// #ifndef __cplusplus
// #endif

// #include "modsecurity/anchored_set_variable.h"
// #include "modsecurity/anchored_variable.h"
// #include "modsecurity/intervention.h"
// #include "modsecurity/collection/collections.h"
// #include "modsecurity/variable_value.h"
// #include "modsecurity/collection/collection.h"
// #include "modsecurity/variable_origin.h"
// #include "modsecurity/anchored_set_variable_translation_proxy.h"
// #include "modsecurity/audit_log.h"


// #ifndef NO_LOGS
// #define ms_dbg(b, c)
//   do {
//       if (m_rules && m_rules->m_debugLog && m_rules->m_debugLog->m_debugLevel >= b) {
//           m_rules->debug(b, *m_id.get(), m_uri, c);
//       }
//   } while (0);
// #else
// #define ms_dbg(b, c)
//   do { } while (0);
// #endif

// #ifndef NO_LOGS
// #define ms_dbg_a(t, b, c)
//   do {
//       if (t && t->m_rules && t->m_rules->m_debugLog && t->m_rules->m_debugLog->m_debugLevel >= b) {
//           t->debug(b, c);
//       }
//   } while (0);
// #else
// #define ms_dbg_a(t, b, c)
//     do { } while (0);
// #endif


// #define LOGFY_ADD(a, b)
//     yajl_gen_string(g, reinterpret_cast<const unsigned char*>(a), strlen(a));
//     if (b == NULL) {
//       yajl_gen_string(g, reinterpret_cast<const unsigned char*>(""),
//           strlen(""));
//     } else {
//       yajl_gen_string(g, reinterpret_cast<const unsigned char*>(b),
//           strlen(b));
//     }


// #define LOGFY_ADD_INT(a, b)
//     yajl_gen_string(g, reinterpret_cast<const unsigned char*>(a), strlen(a));
//     yajl_gen_number(g, reinterpret_cast<const char*>(b), strlen(b));

// #define LOGFY_ADD_NUM(a, b)
//     yajl_gen_string(g, reinterpret_cast<const unsigned char*>(a), strlen(a));
//     yajl_gen_integer(g, b);

// #ifdef __cplusplus
/** enum modsecurity::actions::disruptive::AllowType */
;


// Targeting ../XML.java


// Targeting ../JSON.java


// Targeting ../MultipartPartTmpFile.java



// Targeting ../Operator.java



// Targeting ../TransactionAnchoredVariables.java


// Targeting ../TransactionSecMarkerManagement.java


// Targeting ../Transaction.java




// #endif

// #ifdef __cplusplus
// #endif

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native Transaction msc_new_transaction(ModSecurity ms,
    RulesSet rules, Pointer logCbData);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native Transaction msc_new_transaction_with_id(ModSecurity ms,
    RulesSet rules, @Cast("char*") BytePointer id, Pointer logCbData);
@Namespace("modsecurity") public static native Transaction msc_new_transaction_with_id(ModSecurity ms,
    RulesSet rules, @Cast("char*") ByteBuffer id, Pointer logCbData);
@Namespace("modsecurity") public static native Transaction msc_new_transaction_with_id(ModSecurity ms,
    RulesSet rules, @Cast("char*") byte[] id, Pointer logCbData);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_process_connection(Transaction transaction,
    @Cast("const char*") BytePointer client, int cPort, @Cast("const char*") BytePointer server, int sPort);
@Namespace("modsecurity") public static native int msc_process_connection(Transaction transaction,
    String client, int cPort, String server, int sPort);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_process_request_headers(Transaction transaction);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_add_request_header(Transaction transaction, @Cast("const unsigned char*") BytePointer key,
    @Cast("const unsigned char*") BytePointer value);
@Namespace("modsecurity") public static native int msc_add_request_header(Transaction transaction, @Cast("const unsigned char*") ByteBuffer key,
    @Cast("const unsigned char*") ByteBuffer value);
@Namespace("modsecurity") public static native int msc_add_request_header(Transaction transaction, @Cast("const unsigned char*") byte[] key,
    @Cast("const unsigned char*") byte[] value);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_add_n_request_header(Transaction transaction,
    @Cast("const unsigned char*") BytePointer key, @Cast("size_t") long len_key, @Cast("const unsigned char*") BytePointer value,
    @Cast("size_t") long len_value);
@Namespace("modsecurity") public static native int msc_add_n_request_header(Transaction transaction,
    @Cast("const unsigned char*") ByteBuffer key, @Cast("size_t") long len_key, @Cast("const unsigned char*") ByteBuffer value,
    @Cast("size_t") long len_value);
@Namespace("modsecurity") public static native int msc_add_n_request_header(Transaction transaction,
    @Cast("const unsigned char*") byte[] key, @Cast("size_t") long len_key, @Cast("const unsigned char*") byte[] value,
    @Cast("size_t") long len_value);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_process_request_body(Transaction transaction);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_append_request_body(Transaction transaction,
    @Cast("const unsigned char*") BytePointer body, @Cast("size_t") long size);
@Namespace("modsecurity") public static native int msc_append_request_body(Transaction transaction,
    @Cast("const unsigned char*") ByteBuffer body, @Cast("size_t") long size);
@Namespace("modsecurity") public static native int msc_append_request_body(Transaction transaction,
    @Cast("const unsigned char*") byte[] body, @Cast("size_t") long size);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_request_body_from_file(Transaction transaction, @Cast("const char*") BytePointer path);
@Namespace("modsecurity") public static native int msc_request_body_from_file(Transaction transaction, String path);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_process_response_headers(Transaction transaction, int code,
    @Cast("const char*") BytePointer protocol);
@Namespace("modsecurity") public static native int msc_process_response_headers(Transaction transaction, int code,
    String protocol);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_add_response_header(Transaction transaction,
    @Cast("const unsigned char*") BytePointer key, @Cast("const unsigned char*") BytePointer value);
@Namespace("modsecurity") public static native int msc_add_response_header(Transaction transaction,
    @Cast("const unsigned char*") ByteBuffer key, @Cast("const unsigned char*") ByteBuffer value);
@Namespace("modsecurity") public static native int msc_add_response_header(Transaction transaction,
    @Cast("const unsigned char*") byte[] key, @Cast("const unsigned char*") byte[] value);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_add_n_response_header(Transaction transaction,
    @Cast("const unsigned char*") BytePointer key, @Cast("size_t") long len_key, @Cast("const unsigned char*") BytePointer value,
    @Cast("size_t") long len_value);
@Namespace("modsecurity") public static native int msc_add_n_response_header(Transaction transaction,
    @Cast("const unsigned char*") ByteBuffer key, @Cast("size_t") long len_key, @Cast("const unsigned char*") ByteBuffer value,
    @Cast("size_t") long len_value);
@Namespace("modsecurity") public static native int msc_add_n_response_header(Transaction transaction,
    @Cast("const unsigned char*") byte[] key, @Cast("size_t") long len_key, @Cast("const unsigned char*") byte[] value,
    @Cast("size_t") long len_value);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_process_response_body(Transaction transaction);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_append_response_body(Transaction transaction,
    @Cast("const unsigned char*") BytePointer body, @Cast("size_t") long size);
@Namespace("modsecurity") public static native int msc_append_response_body(Transaction transaction,
    @Cast("const unsigned char*") ByteBuffer body, @Cast("size_t") long size);
@Namespace("modsecurity") public static native int msc_append_response_body(Transaction transaction,
    @Cast("const unsigned char*") byte[] body, @Cast("size_t") long size);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_process_uri(Transaction transaction, @Cast("const char*") BytePointer uri,
    @Cast("const char*") BytePointer protocol, @Cast("const char*") BytePointer http_version);
@Namespace("modsecurity") public static native int msc_process_uri(Transaction transaction, String uri,
    String protocol, String http_version);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native @Cast("const char*") BytePointer msc_get_response_body(Transaction transaction);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native @Cast("size_t") long msc_get_response_body_length(Transaction transaction);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native @Cast("size_t") long msc_get_request_body_length(Transaction transaction);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native void msc_transaction_cleanup(Transaction transaction);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_intervention(Transaction transaction, ModSecurityIntervention it);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_process_logging(Transaction transaction);

/** \ingroup ModSecurity_C_API */
@Namespace("modsecurity") public static native int msc_update_status_code(Transaction transaction, int status);

// #ifdef __cplusplus
  // namespace modsecurity
// #endif


// #endif  // HEADERS_MODSECURITY_TRANSACTION_H_


}
