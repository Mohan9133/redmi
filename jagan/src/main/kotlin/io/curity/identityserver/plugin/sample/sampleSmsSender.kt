package io.curity.identityserver.plugin.sample

import se.curity.identityserver.sdk.service.sms.SmsSender

class sampleSmsSender(private val _configuration: sampleSmsConfig): SmsSender
{
    override fun sendSms(toNumber: String, msg: String): Boolean
    {
        // TODO: Implement sending an sms.
        // Check out the examples on GitHub: https://github.com/search?q=sms+org%3Acurityio&type=Repositories

        return true
    }
}
