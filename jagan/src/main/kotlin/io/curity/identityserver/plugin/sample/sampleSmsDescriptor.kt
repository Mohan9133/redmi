package io.curity.identityserver.plugin.sample

import se.curity.identityserver.sdk.plugin.descriptor.SmsPluginDescriptor

class sampleSmsDescriptor: SmsPluginDescriptor<sampleSmsConfig>
{
    override fun getSmsSenderType() = sampleSmsSender::class.java

    override fun getPluginImplementationType() = "sample"

    override fun getConfigurationType() = sampleSmsConfig::class.java
}
