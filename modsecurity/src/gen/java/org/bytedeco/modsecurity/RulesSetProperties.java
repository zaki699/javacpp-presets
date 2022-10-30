// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;



@Namespace("modsecurity") @NoOffset @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class RulesSetProperties extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RulesSetProperties(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RulesSetProperties(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RulesSetProperties position(long position) {
        return (RulesSetProperties)super.position(position);
    }
    @Override public RulesSetProperties getPointer(long i) {
        return new RulesSetProperties((Pointer)this).offsetAddress(i);
    }

    public RulesSetProperties() { super((Pointer)null); allocate(); }
    private native void allocate();


    public RulesSetProperties(DebugLog debugLog) { super((Pointer)null); allocate(debugLog); }
    private native void allocate(DebugLog debugLog);

    
    


    /**
     *
     *
     */
    /** enum modsecurity::RulesSetProperties::ConfigBoolean */
    public static final int
        TrueConfigBoolean = 0,
        FalseConfigBoolean = 1,
        PropertyNotSetConfigBoolean = 2;


    /**
     *
     * The RuleEngine enumerator consists in mapping the different states
     * of the rule engine.
     *
     */
    /** enum modsecurity::RulesSetProperties::RuleEngine */
    public static final int
     /**
      *
      * Rules won't be evaluated if Rule Engine is set to DisabledRuleEngine
      *
      */
     DisabledRuleEngine = 0,
     /**
      *
      * Rules will be evaluated and disturb actions will take place if needed.
      *
      */
     EnabledRuleEngine = 1,
     /**
      * Rules will be evaluated but it won't generate any disruptive action.
      *
      */
     DetectionOnlyRuleEngine = 2,
     /**
      *
      */
     PropertyNotSetRuleEngine = 3;


    /**
     *
     * Defines what actions should be taken in case the body (response or
     * request) is bigger than the expected size.
     *
     */
    /** enum modsecurity::RulesSetProperties::BodyLimitAction */
    public static final int
     /**
      *
      * Process partial
      *
      */
     ProcessPartialBodyLimitAction = 0,
     /**
      *
      * Reject the request
      *
      */
     RejectBodyLimitAction = 1,
     /**
      *
      */
     PropertyNotSetBodyLimitAction = 2;


    /**
     *
     * Defines what actions should be taken in case the remote rules failed to
     * be downloaded (independent of the circumstances)
     *
     *
     */
    /** enum modsecurity::RulesSetProperties::OnFailedRemoteRulesAction */
    public static final int
     /**
      *
      * Abort
      *
      */
     AbortOnFailedRemoteRulesAction = 0,
     /**
      *
      * Warn on logging
      *
      */
     WarnOnFailedRemoteRulesAction = 1,
     /**
      *
      */
     PropertyNotSetRemoteRulesAction = 2;


    public static native @Cast("const char*") BytePointer ruleEngineStateString(@Cast("modsecurity::RulesSetProperties::RuleEngine") int i);


    public static native @StdString BytePointer configBooleanString(@Cast("modsecurity::RulesSetProperties::ConfigBoolean") int i);


    public native AuditLog m_auditLog(); public native RulesSetProperties m_auditLog(AuditLog setter);
    public native @Cast("modsecurity::RulesSetProperties::BodyLimitAction") int m_requestBodyLimitAction(); public native RulesSetProperties m_requestBodyLimitAction(int setter);
    public native @Cast("modsecurity::RulesSetProperties::BodyLimitAction") int m_responseBodyLimitAction(); public native RulesSetProperties m_responseBodyLimitAction(int setter);
    public native @Cast("modsecurity::RulesSetProperties::ConfigBoolean") int m_secRequestBodyAccess(); public native RulesSetProperties m_secRequestBodyAccess(int setter);
    public native @Cast("modsecurity::RulesSetProperties::ConfigBoolean") int m_secResponseBodyAccess(); public native RulesSetProperties m_secResponseBodyAccess(int setter);
    public native @Cast("modsecurity::RulesSetProperties::ConfigBoolean") int m_secXMLExternalEntity(); public native RulesSetProperties m_secXMLExternalEntity(int setter);
    public native @Cast("modsecurity::RulesSetProperties::ConfigBoolean") int m_tmpSaveUploadedFiles(); public native RulesSetProperties m_tmpSaveUploadedFiles(int setter);
    public native @Cast("modsecurity::RulesSetProperties::ConfigBoolean") int m_uploadKeepFiles(); public native RulesSetProperties m_uploadKeepFiles(int setter);
    public native @ByRef ConfigDouble m_argumentsLimit(); public native RulesSetProperties m_argumentsLimit(ConfigDouble setter);
    public native @ByRef ConfigDouble m_requestBodyJsonDepthLimit(); public native RulesSetProperties m_requestBodyJsonDepthLimit(ConfigDouble setter);
    public native @ByRef ConfigDouble m_requestBodyLimit(); public native RulesSetProperties m_requestBodyLimit(ConfigDouble setter);
    public native @ByRef ConfigDouble m_requestBodyNoFilesLimit(); public native RulesSetProperties m_requestBodyNoFilesLimit(ConfigDouble setter);
    public native @ByRef ConfigDouble m_responseBodyLimit(); public native RulesSetProperties m_responseBodyLimit(ConfigDouble setter);
    public native @ByRef ConfigInt m_uploadFileLimit(); public native RulesSetProperties m_uploadFileLimit(ConfigInt setter);
    public native @ByRef ConfigInt m_uploadFileMode(); public native RulesSetProperties m_uploadFileMode(ConfigInt setter);
    public native DebugLog m_debugLog(); public native RulesSetProperties m_debugLog(DebugLog setter);
    public native @Cast("modsecurity::RulesSetProperties::OnFailedRemoteRulesAction") int m_remoteRulesActionOnFailed(); public native RulesSetProperties m_remoteRulesActionOnFailed(int setter);
    public native @Cast("modsecurity::RulesSetProperties::RuleEngine") int m_secRuleEngine(); public native RulesSetProperties m_secRuleEngine(int setter);
    public native @ByRef RulesExceptions m_exceptions(); public native RulesSetProperties m_exceptions(RulesExceptions setter);
    public native @ByRef StringList m_components(); public native RulesSetProperties m_components(StringList setter);
    public native @ByRef ConfigSet m_responseBodyTypeToBeInspected(); public native RulesSetProperties m_responseBodyTypeToBeInspected(ConfigSet setter);
    public native @ByRef ConfigString m_httpblKey(); public native RulesSetProperties m_httpblKey(ConfigString setter);
    public native @ByRef ConfigString m_uploadDirectory(); public native RulesSetProperties m_uploadDirectory(ConfigString setter);
    public native @ByRef ConfigString m_uploadTmpDirectory(); public native RulesSetProperties m_uploadTmpDirectory(ConfigString setter);
    public native @ByRef ConfigString m_secArgumentSeparator(); public native RulesSetProperties m_secArgumentSeparator(ConfigString setter);
    public native @ByRef ConfigString m_secWebAppId(); public native RulesSetProperties m_secWebAppId(ConfigString setter);
    public native @ByRef ConfigUnicodeMap m_unicodeMapTable(); public native RulesSetProperties m_unicodeMapTable(ConfigUnicodeMap setter);
}
