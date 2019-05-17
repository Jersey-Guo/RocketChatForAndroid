package chat.rocket.core.internal.rest

const val SUCCESS = "{\"success\": true}"
const val MUST_BE_LOGGED_ERROR = "{\"status\":\"error\",\"message\":\"You must be logged in to do this.\"}"

const val LOGIN_SUCCESS = "{\"status\": \"success\",\"data\": {\"authToken\": \"authToken\",\"userId\": \"userId\"}}"
const val LOGIN_ERROR = "{\"status\": \"error\",\"message\": \"Unauthorized\"}"

const val LOGOUT_SUCCESS = "{ \"status\": \"success\", \"data\": { \"message\": \"You've been logged out!\" } }"

const val USER_NOT_FOUND_ERROR = "{\"status\": \"false\",\"message\": \"User not found\"}"

const val USER_REGISTER_SUCCESS =
    "{\"user\":{\"_id\":\"userId\",\"createdAt\":\"2017-11-07T15:59:50.432Z\",\"services\":{\"password\":{\"bcrypt\":\"bcrypt-password\"},\"email\":{\"verificationTokens\":[{\"token\":\"verificationToken\",\"address\":\"test@email.com\",\"when\":\"2017-11-07T15:59:50.457Z\"}]}},\"emails\":[{\"address\":\"test@email.com\",\"verified\":false}],\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Test User\",\"_updatedAt\":\"2017-11-07T15:59:51.144Z\",\"roles\":[\"user\"],\"username\":\"testuser\"},\"success\":true}"
const val USER_UPDATE_SUCCESS =
    "{\"user\":{\"_id\":\"userId\",\"createdAt\":\"2017-11-07T15:59:50.432Z\",\"services\":{\"password\":{\"bcrypt\":\"new-bcrypt-password\"},\"email\":{\"verificationTokens\":[{\"token\":\"verificationToken\",\"address\":\"test@email.com\",\"when\":\"2017-11-07T15:59:50.457Z\"}]}},\"emails\":[{\"address\":\"test@email.com\",\"verified\":false}],\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"New name\",\"_updatedAt\":\"2017-11-07T15:59:51.144Z\",\"roles\":[\"user\"],\"username\":\"new-username\"},\"success\":true}"

const val FAIL_EMAIL_IN_USE = "{\"success\":false,\"error\":\"Email already exists. [403]\",\"errorType\":403}"
const val FAIL_USER_IN_USE =
    "{\"success\":false,\"error\":\"<strong>testuser</strong> is already in use :( [error-field-unavailable]\",\"errorType\":\"error-field-unavailable\"}"

const val ME_SUCCESS =
    "{\"_id\":\"userid\",\"name\":\"testuser\",\"emails\":[{\"address\":\"testuser@test.com\",\"verified\":false}],\"status\":\"offline\",\"statusConnection\":\"offline\",\"username\":\"testuser\",\"utcOffset\":-3,\"active\":true,\"success\":true}"
const val ME_UNAUTHORIZED = "{\"status\":\"error\",\"message\":\"You must be logged in to do this.\"}"

const val USER_SUBSCRIPTIONS_OK =
    "{\"channels\":[{\"_id\":\"GENERAL\",\"ts\":\"2017-10-20T12:51:33.778Z\",\"t\":\"c\",\"name\":\"general\",\"msgs\":23,\"default\":true,\"_updatedAt\":\"2017-11-17T16:16:04.654Z\",\"lm\":\"2017-11-06T16:02:00.611Z\",\"usernames\":[\"testuser\",\"testuser1\"]}],\"offset\":0,\"count\":1,\"total\":1,\"success\":true}"

const val SEND_MESSAGE_OK_UPDATED =
    "{\"ts\":1511443964815,\"channel\":\"GENERAL\",\"message\":{\"alias\":\"TestingAlias\",\"msg\":\"Updating a message previously sent to #general\",\"parseUrls\":true,\"groupable\":false,\"avatar\":\"https://avatars2.githubusercontent.com/u/224255?s=88&v=4\",\"ts\":\"2017-11-23T13:32:44.798Z\",\"u\":{\"_id\":\"userId\",\"username\":\"testuser\",\"name\":\"testuser\"},\"rid\":\"GENERAL\",\"channels\":[{\"_id\":\"GENERAL\",\"name\":\"general\"}],\"_updatedAt\":\"2017-11-23T13:32:44.808Z\",\"_id\":\"messageId\"},\"success\":true}"

const val SEND_MESSAGE_OK =
    "{\"ts\":1511443964815,\"channel\":\"GENERAL\",\"message\":{\"alias\":\"TestingAlias\",\"msg\":\"Sending message from SDK to #general and @here with url https://github.com/RocketChat/Rocket.Chat.Kotlin.SDK/\",\"parseUrls\":true,\"groupable\":false,\"avatar\":\"https://avatars2.githubusercontent.com/u/224255?s=88&v=4\",\"ts\":\"2017-11-23T13:32:44.798Z\",\"u\":{\"_id\":\"userId\",\"username\":\"testuser\",\"name\":\"testuser\"},\"rid\":\"GENERAL\",\"urls\":[{\"url\":\"https://github.com/RocketChat/Rocket.Chat.Kotlin.SDK/\"}],\"mentions\":[{\"_id\":\"here\",\"username\":\"here\"}],\"channels\":[{\"_id\":\"GENERAL\",\"name\":\"general\"}],\"_updatedAt\":\"2017-11-23T13:32:44.808Z\",\"_id\":\"messageId\"},\"success\":true}"

const val DELETE_MESSAGE_OK = "{\"_id\":\"messageId\",\"ts\":1511443964815,\"success\":true}"

const val MEMBERS_OK =
    "{\"members\":[{\"_id\":\"userid\",\"username\":\"filipedelimabrito\",\"name\":\"Filipe de Lima Brito\",\"status\":\"online\",\"utcOffset\":-6}],\"count\":1,\"offset\":0,\"total\":1,\"success\":true}"

const val MENTIONS_OK = "{\n" +
        "    \"mentions\": [\n" +
        "        {\n" +
        "            \"_id\": \"Gptx3mc6TjSv5tLWb\",\n" +
        "            \"rid\": \"GENERAL\",\n" +
        "            \"msg\": \"@rocket.cat\",\n" +
        "            \"ts\": \"2018-03-12T14:59:14.166Z\",\n" +
        "            \"u\": {\n" +
        "                \"_id\": \"47cRd58HnWwpqxhaZ\",\n" +
        "                \"username\": \"test\",\n" +
        "                \"name\": \"test\"\n" +
        "            },\n" +
        "            \"mentions\": [\n" +
        "                {\n" +
        "                    \"_id\": \"47cRd58HnWwpqxhaZ\",\n" +
        "                    \"username\": \"rocket.cat\"\n" +
        "                }\n" +
        "            ],\n" +
        "            \"channels\": [],\n" +
        "            \"_updatedAt\": \"2018-03-12T14:59:14.171Z\"\n" +
        "        }\n" +
        "    ],\n" +
        "    \"count\": 1,\n" +
        "    \"offset\": 0,\n" +
        "    \"total\": 1,\n" +
        "    \"success\": true\n" +
        "}"

const val MESSAGES_OK = "{\n" +
        "    \"messages\": [\n" +
        "        {\n" +
        "            \"_id\": \"px9KLW9G2SfD5DKFt\",\n" +
        "            \"rid\": \"GENERAL\",\n" +
        "            \"msg\": \"this is a test\",\n" +
        "            \"ts\": \"2018-03-27T14:44:00.549Z\",\n" +
        "            \"u\": {\n" +
        "                \"_id\": \"RtMDEYc28fQ5aHpf4\",\n" +
        "                \"username\": \"marcos.defendi\",\n" +
        "                \"name\": \"Marcos Defendi\"\n" +
        "            },\n" +
        "            \"mentions\": [],\n" +
        "            \"channels\": [],\n" +
        "            \"_updatedAt\": \"2018-03-27T14:44:00.550Z\",\n" +
        "            \"score\": 0.5833333333333334\n" +
        "        }\n" +
        "    ],\n" +
        "    \"success\": true\n" +
        "}"

const val ROOMS_OK =
    "{\"update\":[{\"_id\":\"cBD6dHc7oBvGjkruMrocket.cat\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"cBD6dHc7oBvGjkruMnGgokxmGQtrwe4qyh\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"cBD6dHc7oBvGjkruMkcqDE6baR7Y5gHLEf\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"cBD6dHc7oBvGjkruMw4XQhPWoSCN29ZtQG\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"cBD6dHc7oBvGjkruMrdDGZc75Grpnd5Tdf\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"7fw6XRQWHi4Ak3zj4cBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-10-31T19:59:25.629Z\"},{\"_id\":\"MHNCPQyQnzdjRPiuRcBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-12-22T13:06:34.726Z\"},{\"_id\":\"cBD6dHc7oBvGjkruMnBe2T2HXC6KEyzK2P\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"G75tcPe8QHAL56BZ4cBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"YdpayxcMhWFGKRZb3cBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"nNT3JREJNY8j7uFHX\",\"name\":\"android-dev-internal\",\"t\":\"p\",\"u\":{\"_id\":\"jrnR99viqXELp4XYn\",\"username\":\"marcelo.schmidt\"},\"_updatedAt\":\"2017-09-06T12:43:31.943Z\",\"archived\":true,\"customFields\":{},\"ro\":false},{\"_id\":\"cBD6dHc7oBvGjkruMjrnR99viqXELp4XYn\",\"t\":\"d\",\"_updatedAt\":\"2017-11-23T17:59:59.070Z\"},{\"_id\":\"cBD6dHc7oBvGjkruMg9vNPgp6C4nDpSp8W\",\"t\":\"d\",\"_updatedAt\":\"2017-10-02T18:53:45.591Z\"},{\"_id\":\"cBD6dHc7oBvGjkruMkAuTB2QwESvC6XWtB\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"cBD6dHc7oBvGjkruMoJWt2aGXP7wo9gPBi\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"N8HuZbMTSeZyZi6wc\",\"name\":\"mobile-native\",\"t\":\"p\",\"u\":{\"_id\":null,\"username\":null},\"topic\":\"Channel to discuss common functionality between iOS and Android - See [Spec](https://docs.google.com/spreadsheets/d/1SvHnjpI6TFes89VgwrUUwB0T0NvEkJQmoM9Vi-XqxXg/edit?usp=drive_web)\",\"_updatedAt\":\"2017-09-06T12:43:15.867Z\",\"archived\":true,\"jitsiTimeout\":\"2016-11-18T11:08:35.225Z\",\"ro\":false},{\"_id\":\"cBD6dHc7oBvGjkruMrXNAqsj2LJCCyqE6D\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"cBD6dHc7oBvGjkruMosnQaABmyfQoadYqW\",\"t\":\"d\",\"_updatedAt\":\"2017-08-28T16:49:10.846Z\"},{\"_id\":\"Cbmjf5XxJoSpQtd6EcBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"8WCaFa2Jve4FNjMYacBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-09-29T14:43:54.286Z\"},{\"_id\":\"cBD6dHc7oBvGjkruMuWiyfQkgekhXywvKw\",\"t\":\"d\",\"_updatedAt\":\"2017-12-06T00:24:57.156Z\"},{\"_id\":\"YWPMv8Z33hdQ9h6NkcBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"jyki6cZ338aisMsG9\",\"name\":\"movile\",\"t\":\"p\",\"u\":{\"_id\":\"4SFNEydqQhHtj5KkP\",\"username\":\"gabriel.engel\"},\"_updatedAt\":\"2017-10-31T18:11:52.506Z\"},{\"_id\":\"cBD6dHc7oBvGjkruMufcwE9NeH8MKik7AS\",\"t\":\"d\",\"_updatedAt\":\"2017-08-22T18:20:11.890Z\"},{\"_id\":\"F6gZmaujtQceMst7TcBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-09-18T12:58:55.853Z\"},{\"_id\":\"F3WPrkRCHsQXnkpQE\",\"name\":\"filipedelimabrito-public-channel\",\"fname\":\"filipedelimabrito-public-channel\",\"t\":\"c\",\"u\":{\"_id\":\"8WCaFa2Jve4FNjMYa\",\"username\":\"filipedelimabrito\"},\"_updatedAt\":\"2017-10-09T21:43:31.647Z\",\"customFields\":{},\"ro\":false},{\"_id\":\"Qhyt2tDnJ7H3ELMcC\",\"name\":\"mobile-circleci\",\"fname\":\"mobile-circleci\",\"t\":\"p\",\"u\":{\"_id\":\"MHNCPQyQnzdjRPiuR\",\"username\":\"rafael.kellermann\"},\"muted\":[\"filipe.brito\",\"leonardo.aramaki\",\"lucio.maciel\",\"matheus.cardoso\"],\"_updatedAt\":\"2017-12-04T11:59:54.417Z\",\"jitsiTimeout\":\"2017-09-12T13:27:19.223Z\",\"customFields\":{},\"ro\":true,\"reactWhenReadOnly\":true},{\"_id\":\"KCEnsZw4GHwcXrRrEcBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-10-26T18:24:02.719Z\"},{\"_id\":\"MZiFvWAfF4RF4AD5ucBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-10-10T21:22:03.354Z\"},{\"_id\":\"YFGDi4YmQEda4FkPC\",\"name\":\"rocketchat-security\",\"fname\":\"rocketchat-security\",\"t\":\"p\",\"u\":{\"_id\":\"MZiFvWAfF4RF4AD5u\",\"username\":\"rodrigo.nascimento\"},\"_updatedAt\":\"2017-10-11T00:10:14.703Z\",\"customFields\":{},\"ro\":false},{\"_id\":\"cBD6dHc7oBvGjkruMj6Ge8FJTqjNyQoJsv\",\"t\":\"d\",\"_updatedAt\":\"2017-10-13T19:27:28.752Z\"},{\"_id\":\"cBD6dHc7oBvGjkruMtTkbX7TdzMceKmCqW\",\"t\":\"d\",\"_updatedAt\":\"2017-11-16T18:57:05.138Z\"},{\"_id\":\"Br5ZisLJ8va98jFBD\",\"name\":\"officevibe\",\"fname\":\"officevibe\",\"t\":\"p\",\"u\":{\"_id\":\"jrnR99viqXELp4XYn\",\"username\":\"marcelo.schmidt\"},\"topic\":\"Officevibe poll answers\",\"_updatedAt\":\"2017-12-21T17:40:33.614Z\",\"description\":\"Here we&#39;ll share Officevibe poll answers, so everyone can get to know each other.\",\"customFields\":{},\"ro\":false},{\"_id\":\"3r7JSBtEGaeaPWjsicBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-11-29T14:22:37.266Z\"},{\"_id\":\"FaXMyHqbNJbPq6Ym9cBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-12-05T22:24:13.373Z\"},{\"_id\":\"2B6NWL88MoijfZswt\",\"name\":\"rocket.chat.summit\",\"fname\":\"rocket.chat.summit\",\"t\":\"p\",\"u\":{\"_id\":\"jrnR99viqXELp4XYn\",\"username\":\"marcelo.schmidt\"},\"_updatedAt\":\"2017-12-21T22:45:53.490Z\",\"customFields\":{},\"ro\":false},{\"_id\":\"mSCEim3yGNb2rZhev\",\"name\":\"androidnativeapp\",\"t\":\"c\",\"u\":{\"_id\":\"KdgnfaCiHf2yxPiaX\",\"username\":\"julio.cesar.bueno.cotta\"},\"_updatedAt\":\"2017-12-28T10:03:40.415Z\"},{\"_id\":\"k46YezYaE9jmvi7uM\",\"name\":\"random\",\"t\":\"p\",\"u\":{\"_id\":\"CA57idSqCkvBHHC8w\",\"username\":\"foo-11\"},\"topic\":\"Off-Topic Dumb Stuff\",\"_updatedAt\":\"2017-12-28T10:11:19.956Z\",\"archived\":false,\"jitsiTimeout\":\"2017-11-28T23:09:19.786Z\"},{\"_id\":\"2vmeeZapHrxqWKif2\",\"name\":\"android-native-sdk\",\"t\":\"p\",\"u\":{\"_id\":\"MHNCPQyQnzdjRPiuR\",\"username\":\"rafael.kellermann\"},\"_updatedAt\":\"2017-12-28T15:13:03.560Z\",\"jitsiTimeout\":\"2017-06-29T04:14:56.812Z\",\"customFields\":{},\"ro\":false},{\"_id\":\"QG6WKaB3YZKzv2ykN\",\"name\":\"important\",\"t\":\"p\",\"u\":{\"_id\":\"4SFNEydqQhHtj5KkP\",\"username\":\"gabriel.engel\"},\"topic\":\"Announcements, Items needing attention, Team wide inquiries, etc. Go to [BambooHR](https://rocketchat.bamboohr.com) for time off requests.\",\"announcement\":\"\",\"_updatedAt\":\"2017-12-28T16:30:11.710Z\",\"jitsiTimeout\":\"2017-11-30T23:01:33.699Z\",\"ro\":false},{\"_id\":\"KK6xPd6zQb5MyEjYbcBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-12-28T17:47:12.789Z\"},{\"_id\":\"Y6587MM9T2ca4m9AP\",\"name\":\"rocketchat-working-on\",\"fname\":\"rocketchat-working-on\",\"t\":\"p\",\"u\":{\"_id\":\"MZiFvWAfF4RF4AD5u\",\"username\":\"rodrigo.nascimento\"},\"topic\":\"The purpose is to keep the rest of the team up-to-date with what you are busy with each day\",\"_updatedAt\":\"2017-12-28T17:49:31.024Z\",\"description\":\"We created this channel for each team member to post what they are working on for they day. The purpose is to keep the rest of the team up-to-date with what you are busy with each day. Keep each post short, don&amp;#39;t talk about what you did yesterday or are doing tomorrow, don&amp;#39;t mention generic things like meetings, emails, todos etc. An informative update will list only a handful of tasks and link to issues or documents.\",\"customFields\":{},\"ro\":false},{\"_id\":\"FATCnDk5egNtRvQfv\",\"name\":\"rocket-dev\",\"t\":\"p\",\"u\":{\"_id\":\"7fw6XRQWHi4Ak3zj4\",\"username\":\"aaron.ogle\"},\"topic\":\"Making an awesome chat platform!\",\"_updatedAt\":\"2017-12-28T17:59:59.545Z\",\"jitsiTimeout\":\"2017-10-04T14:41:15.330Z\"},{\"_id\":\"5KAw6vTLBkSJKefae\",\"name\":\"android-app-rewrite\",\"fname\":\"android-app-rewrite\",\"t\":\"p\",\"u\":{\"_id\":\"MHNCPQyQnzdjRPiuR\",\"username\":\"rafael.kellermann\"},\"_updatedAt\":\"2017-12-28T17:59:50.506Z\",\"customFields\":{},\"ro\":false},{\"_id\":\"8MyxXwfqeioYwmnnKcBD6dHc7oBvGjkruM\",\"t\":\"d\",\"_updatedAt\":\"2017-12-28T23:51:31.028Z\"},{\"_id\":\"uaNMXwBvMSd8Lt2zG\",\"name\":\"jobs\",\"t\":\"c\",\"u\":{\"_id\":\"LuQZ9zJmsgPX5tJdg\",\"username\":\"Goran\"},\"topic\":\"RC related jobs only.  Please use DM or email for followup\",\"_updatedAt\":\"2017-12-29T04:52:08.399Z\"},{\"_id\":\"9fcPiSCwpW8uB6fok\",\"name\":\"iosnativeapp\",\"t\":\"c\",\"u\":{\"_id\":\"MHNCPQyQnzdjRPiuR\",\"username\":\"rafael.kellermann\"},\"_updatedAt\":\"2017-12-29T02:32:20.780Z\",\"customFields\":{},\"ro\":false},{\"_id\":\"tn3EiAYecbtXGEBDn\",\"name\":\"mobile-internal\",\"t\":\"p\",\"u\":{\"_id\":\"MHNCPQyQnzdjRPiuR\",\"username\":\"rafael.kellermann\"},\"topic\":\"Mobile Native Applications\",\"_updatedAt\":\"2017-12-29T13:07:19.181Z\",\"archived\":false,\"jitsiTimeout\":\"2017-09-19T00:38:49.750Z\",\"description\":\"This group is related to all internal Native Mobile development of Rocket.Chat discussions.\",\"customFields\":{},\"ro\":false,\"reactWhenReadOnly\":true},{\"_id\":\"AALrfqnPPNykhvhWo\",\"name\":\"rocketchat-ux\",\"fname\":\"rocketchat-ux\",\"t\":\"p\",\"u\":{\"_id\":\"tTkbX7TdzMceKmCqW\",\"username\":\"arthur.giustina\"},\"_updatedAt\":\"2017-12-29T13:24:13.100Z\",\"jitsiTimeout\":\"2017-11-07T16:57:22.223Z\",\"customFields\":{},\"ro\":false},{\"_id\":\"GENERAL\",\"name\":\"general\",\"t\":\"c\",\"topic\":\"Community support in [#support](https://demo.rocket.chat/channel/support). Discussions in our [forums](https://forums.rocket.chat/).  Find jobs in [#jobs](https://demo.rocket.chat/channel/jobs)\",\"announcement\":\"Try our new discussion forums - https://forums.rocket.chat\",\"muted\":[\"geekgonecrazy\"],\"_updatedAt\":\"2017-12-29T13:32:07.017Z\",\"jitsiTimeout\":\"2017-09-15T00:27:28.892Z\",\"default\":true}],\"remove\":[],\"success\":true}\n"

const val SUBSCRIPTIONS_OK =
    "{\"update\":[{\"t\":\"d\",\"ts\":\"2017-07-03T21:05:57.742Z\",\"ls\":\"2017-07-03T21:05:57.742Z\",\"name\":\"rocket.cat\",\"fname\":\"Rocket.Cat\",\"rid\":\"cBD6dHc7oBvGjkruMrocket.cat\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"_updatedAt\":\"2017-12-20T10:52:55.624Z\",\"_id\":\"ETavwSdZEXMgDK2d6\"},{\"t\":\"d\",\"name\":\"andrey.k\",\"fname\":\"Andrey K\",\"rid\":\"cBD6dHc7oBvGjkruMnGgokxmGQtrwe4qyh\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"_updatedAt\":\"2017-12-26T10:02:11.510Z\",\"_id\":\"G38YRCnvF5KJy7ZcW\"},{\"t\":\"d\",\"ls\":\"2017-07-19T00:58:55.048Z\",\"name\":\"kaikos\",\"fname\":\"أيت أورير 24\",\"rid\":\"cBD6dHc7oBvGjkruMkcqDE6baR7Y5gHLEf\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"_updatedAt\":\"2017-12-12T17:05:44.148Z\",\"_id\":\"LMRohJAbxG7i3zko8\"},{\"t\":\"d\",\"ts\":\"2017-07-19T17:02:58.275Z\",\"ls\":\"2017-07-19T19:56:17.653Z\",\"name\":\"karan-96\",\"fname\":\"Karan Batra\",\"rid\":\"cBD6dHc7oBvGjkruMw4XQhPWoSCN29ZtQG\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"_updatedAt\":\"2017-11-11T06:53:48.712Z\",\"_id\":\"MHNu4kMocapR9XYAJ\"},{\"t\":\"d\",\"ls\":\"2017-07-15T18:17:18.492Z\",\"name\":\"feliphe\",\"fname\":\"Feliphe Queiróz\",\"rid\":\"cBD6dHc7oBvGjkruMrdDGZc75Grpnd5Tdf\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"_updatedAt\":\"2017-10-12T19:38:32.293Z\",\"_id\":\"PrLQYBDsHzPmJdunc\"},{\"t\":\"d\",\"ts\":\"2017-08-04T18:16:55.571Z\",\"ls\":\"2017-10-31T19:59:05.144Z\",\"name\":\"aaron.ogle\",\"fname\":\"Aaron Ogle\",\"rid\":\"7fw6XRQWHi4Ak3zj4cBD6dHc7oBvGjkruM\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T10:13:25.819Z\",\"_id\":\"RDMfebit3EGpgtXNA\"},{\"t\":\"d\",\"ts\":\"2017-06-23T12:30:44.291Z\",\"ls\":\"2017-12-22T13:06:44.491Z\",\"name\":\"rafael.kellermann\",\"fname\":\"Rafael Kellermann Streit\",\"rid\":\"MHNCPQyQnzdjRPiuRcBD6dHc7oBvGjkruM\",\"f\":true,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T02:35:25.003Z\",\"_id\":\"aauhEcjXBcdEaJNSy\"},{\"t\":\"d\",\"ls\":\"2017-07-13T00:51:36.424Z\",\"name\":\"matheus.jardim.bernardes\",\"fname\":\"Matheus Jardim Bernardes\",\"rid\":\"cBD6dHc7oBvGjkruMnBe2T2HXC6KEyzK2P\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"_updatedAt\":\"2017-10-19T16:10:21.664Z\",\"_id\":\"g7JaxybhyAGBqhBM5\"},{\"t\":\"d\",\"ts\":\"2017-08-18T22:27:49.246Z\",\"ls\":\"2017-08-18T22:27:49.246Z\",\"name\":\"FlavioTI\",\"fname\":\"Flávio Dagnoni (Geração android)\",\"rid\":\"G75tcPe8QHAL56BZ4cBD6dHc7oBvGjkruM\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"_updatedAt\":\"2017-08-22T18:20:12.159Z\",\"_id\":\"pK7gqY9YQxgjTYdHL\"},{\"t\":\"d\",\"ls\":\"2017-06-23T12:39:24.757Z\",\"name\":\"hubot\",\"fname\":\"Hubot\",\"rid\":\"YdpayxcMhWFGKRZb3cBD6dHc7oBvGjkruM\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"_updatedAt\":\"2017-12-28T11:16:32.149Z\",\"_id\":\"pSrSkBpeSHhfdKmv3\"},{\"t\":\"p\",\"ts\":\"2017-06-23T13:46:04.636Z\",\"ls\":\"2017-08-01T13:28:38.159Z\",\"name\":\"android-dev-internal\",\"rid\":\"nNT3JREJNY8j7uFHX\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"archived\":true,\"_updatedAt\":\"2017-09-06T12:43:31.954Z\",\"_id\":\"9rmunswiCuak85Ahk\"},{\"t\":\"d\",\"ls\":\"2017-11-23T18:00:27.783Z\",\"name\":\"marcelo.schmidt\",\"fname\":\"Marcelo Schmidt\",\"rid\":\"cBD6dHc7oBvGjkruMjrnR99viqXELp4XYn\",\"f\":true,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T08:59:09.698Z\",\"_id\":\"seNSMZw7r644kkGun\"},{\"t\":\"d\",\"ls\":\"2017-10-02T19:26:48.285Z\",\"name\":\"sachin.shinde\",\"fname\":\"sachin shinde\",\"rid\":\"cBD6dHc7oBvGjkruMg9vNPgp6C4nDpSp8W\",\"f\":false,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-27T19:27:08.189Z\",\"_id\":\"NLn8dP3novYDkMz5N\"},{\"t\":\"d\",\"ts\":\"2017-08-04T17:40:40.040Z\",\"ls\":\"2017-08-04T17:40:40.040Z\",\"name\":\"1111111\",\"fname\":\"Andrew Axelrod\",\"rid\":\"cBD6dHc7oBvGjkruMkAuTB2QwESvC6XWtB\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-08-22T18:20:12.159Z\",\"_id\":\"gYvYPReKPDq9taNvA\"},{\"t\":\"d\",\"ts\":\"2017-08-04T18:37:55.628Z\",\"ls\":\"2017-08-04T18:37:55.628Z\",\"name\":\"rafa\",\"fname\":\"Rafael\",\"rid\":\"cBD6dHc7oBvGjkruMoJWt2aGXP7wo9gPBi\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-08-22T18:20:12.159Z\",\"_id\":\"jcoazmW5FsuTits9j\"},{\"t\":\"p\",\"ts\":\"2017-06-23T13:46:42.375Z\",\"ls\":\"2017-08-29T00:20:00.379Z\",\"name\":\"mobile-native\",\"rid\":\"N8HuZbMTSeZyZi6wc\",\"f\":false,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"archived\":true,\"_updatedAt\":\"2017-09-06T12:43:15.877Z\",\"_id\":\"a7k4pBX5J9Rjuy9jc\"},{\"t\":\"d\",\"ts\":\"2017-08-09T00:59:28.184Z\",\"ls\":\"2017-08-09T00:59:28.184Z\",\"name\":\"changwuf31\",\"fname\":\"Jhon Wang\",\"rid\":\"cBD6dHc7oBvGjkruMrXNAqsj2LJCCyqE6D\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-08-22T18:20:12.159Z\",\"_id\":\"oJ68wTsiAEtbcmud4\"},{\"t\":\"d\",\"ts\":\"2017-08-16T17:12:40.722Z\",\"ls\":\"2017-08-28T18:41:05.288Z\",\"name\":\"karl.prieb\",\"fname\":\"Karl Prieb\",\"rid\":\"cBD6dHc7oBvGjkruMosnQaABmyfQoadYqW\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-27T20:52:04.317Z\",\"_id\":\"2wdBC8TnS273C8gpB\"},{\"t\":\"d\",\"ts\":\"2017-08-14T23:34:37.894Z\",\"ls\":\"2017-08-14T23:34:37.894Z\",\"name\":\"Arnab\",\"fname\":\"Md. Hasib Hasan Tarafder\",\"rid\":\"Cbmjf5XxJoSpQtd6EcBD6dHc7oBvGjkruM\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-08-22T18:20:12.159Z\",\"_id\":\"LSEc34rxYiHTGvszm\"},{\"t\":\"d\",\"ts\":\"2017-08-22T16:29:19.776Z\",\"ls\":\"2017-10-06T21:10:07.953Z\",\"name\":\"filipedelimabrito\",\"fname\":\"filipedelimabrito\",\"rid\":\"8WCaFa2Jve4FNjMYacBD6dHc7oBvGjkruM\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-04T20:31:10.980Z\",\"_id\":\"QXaNp96cRDhTCWs8N\"},{\"t\":\"d\",\"ls\":\"2017-12-06T00:24:11.198Z\",\"name\":\"leonardo.aramaki\",\"fname\":\"Leonardo Aramaki\",\"rid\":\"cBD6dHc7oBvGjkruMuWiyfQkgekhXywvKw\",\"f\":true,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T04:10:13.457Z\",\"_id\":\"xWrXyBQyz6BFfhnFz\"},{\"t\":\"d\",\"ts\":\"2017-08-17T11:11:10.669Z\",\"ls\":\"2017-08-17T11:11:10.669Z\",\"name\":\"Leossandro\",\"fname\":\"Leo Sandro\",\"rid\":\"YWPMv8Z33hdQ9h6NkcBD6dHc7oBvGjkruM\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-08-22T18:20:12.159Z\",\"_id\":\"dKFpsJCmq976ne4jf\"},{\"t\":\"p\",\"ts\":\"2017-06-23T13:46:36.537Z\",\"ls\":\"2017-10-31T19:48:05.901Z\",\"name\":\"movile\",\"rid\":\"jyki6cZ338aisMsG9\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-10-31T19:48:05.901Z\",\"_id\":\"4aXuMTzK4Hq7YTPxA\"},{\"t\":\"d\",\"ts\":\"2017-08-18T22:29:22.230Z\",\"ls\":\"2017-08-18T22:29:22.230Z\",\"name\":\"Brandon.Toledano\",\"fname\":\"Brandon Toledano\",\"rid\":\"cBD6dHc7oBvGjkruMufcwE9NeH8MKik7AS\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-10-12T03:23:12.810Z\",\"_id\":\"eXPCC5pRuY6qQ68x8\"},{\"t\":\"d\",\"ls\":\"2017-09-18T13:03:07.636Z\",\"name\":\"julia.grala\",\"fname\":\"Júlia Grala Nogueira\",\"rid\":\"F6gZmaujtQceMst7TcBD6dHc7oBvGjkruM\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-27T17:55:29.461Z\",\"_id\":\"d2SRNTzK6td84dKoi\"},{\"t\":\"c\",\"ts\":\"2017-09-01T18:04:05.967Z\",\"ls\":\"2017-10-10T00:06:53.217Z\",\"name\":\"filipedelimabrito-public-channel\",\"fname\":\"filipedelimabrito-public-channel\",\"rid\":\"F3WPrkRCHsQXnkpQE\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\",\"name\":\"Filipe Brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-10-10T00:06:53.217Z\",\"_id\":\"X9wAysc2DZ3TYgxHi\"},{\"t\":\"p\",\"ts\":\"2017-09-12T13:47:08.630Z\",\"ls\":\"2017-12-04T13:22:05.941Z\",\"name\":\"mobile-circleci\",\"fname\":\"mobile-circleci\",\"rid\":\"Qhyt2tDnJ7H3ELMcC\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\",\"name\":\"Filipe Brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-04T13:22:05.941Z\",\"_id\":\"kDBNBBuhyQexSm7Ff\"},{\"t\":\"d\",\"ts\":\"2017-09-14T18:32:38.247Z\",\"ls\":\"2017-10-26T18:23:41.597Z\",\"name\":\"bradley.hilton\",\"fname\":\"Bradley Hilton\",\"rid\":\"KCEnsZw4GHwcXrRrEcBD6dHc7oBvGjkruM\",\"f\":false,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T04:58:05.263Z\",\"_id\":\"LraSDQfWEmAfFbRik\"},{\"t\":\"d\",\"ts\":\"2017-09-20T17:23:13.017Z\",\"ls\":\"2017-09-29T16:27:04.755Z\",\"name\":\"rodrigo.nascimento\",\"fname\":\"Rodrigo Nascimento\",\"rid\":\"MZiFvWAfF4RF4AD5ucBD6dHc7oBvGjkruM\",\"f\":true,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T11:34:16.015Z\",\"_id\":\"9cWyfKvGiBQ6o2FLs\"},{\"t\":\"p\",\"ts\":\"2017-10-11T00:09:45.971Z\",\"ls\":\"2017-10-12T00:17:02.436Z\",\"name\":\"rocketchat-security\",\"fname\":\"rocketchat-security\",\"rid\":\"YFGDi4YmQEda4FkPC\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\",\"name\":\"Filipe Brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-10-12T00:17:02.436Z\",\"_id\":\"MxbhCnx79DCkp3auG\"},{\"t\":\"d\",\"ts\":\"2017-10-13T19:04:47.016Z\",\"ls\":\"2017-10-13T19:27:38.039Z\",\"name\":\"matheus.cardoso\",\"fname\":\"Matheus Cardoso\",\"rid\":\"cBD6dHc7oBvGjkruMj6Ge8FJTqjNyQoJsv\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T11:49:40.364Z\",\"_id\":\"xmgnPKxemvJqLBhEM\"},{\"t\":\"d\",\"ls\":\"2017-11-16T18:57:10.526Z\",\"name\":\"arthur.giustina\",\"fname\":\"Arthur Della Giustina\",\"rid\":\"cBD6dHc7oBvGjkruMtTkbX7TdzMceKmCqW\",\"f\":true,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T06:47:25.962Z\",\"_id\":\"dD7NMYHMeDmjrHoZu\"},{\"t\":\"p\",\"ts\":\"2017-11-08T17:06:08.550Z\",\"ls\":\"2017-12-21T20:51:42.592Z\",\"name\":\"officevibe\",\"fname\":\"officevibe\",\"rid\":\"Br5ZisLJ8va98jFBD\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\",\"name\":\"Filipe Brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-21T20:51:42.592Z\",\"_id\":\"PndGhg8c5JwLzkQRW\"},{\"t\":\"d\",\"ts\":\"2017-11-29T14:22:37.253Z\",\"ls\":\"2017-11-29T14:22:37.253Z\",\"name\":\"ramon.nobre\",\"fname\":\"Ramon\",\"rid\":\"3r7JSBtEGaeaPWjsicBD6dHc7oBvGjkruM\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-17T20:38:07.529Z\",\"_id\":\"nupLzwrf8Cz2ywqoE\"},{\"t\":\"d\",\"name\":\"le0ssa\",\"fname\":\"le0ssa\",\"rid\":\"FaXMyHqbNJbPq6Ym9cBD6dHc7oBvGjkruM\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":false,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-26T22:12:42.802Z\",\"_id\":\"aNMJ7YBKK8cwhF3hd\"},{\"t\":\"p\",\"ts\":\"2017-12-21T19:48:11.499Z\",\"ls\":\"2017-12-22T09:44:58.972Z\",\"name\":\"rocket.chat.summit\",\"fname\":\"rocket.chat.summit\",\"rid\":\"2B6NWL88MoijfZswt\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\",\"name\":\"Filipe Brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-22T09:44:58.972Z\",\"_id\":\"Gv529Ake59Lpk56hr\"},{\"t\":\"c\",\"ts\":\"2017-06-23T13:45:59.935Z\",\"ls\":\"2017-12-28T13:20:05.819Z\",\"name\":\"androidnativeapp\",\"rid\":\"mSCEim3yGNb2rZhev\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T13:20:05.819Z\",\"_id\":\"h6F5evEdmXo8rwsoA\"},{\"t\":\"p\",\"ts\":\"2017-06-23T13:46:26.688Z\",\"ls\":\"2017-12-28T13:21:44.463Z\",\"name\":\"random\",\"rid\":\"k46YezYaE9jmvi7uM\",\"f\":false,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T13:21:44.463Z\",\"_id\":\"f9aobJRXcdwTEpmQf\"},{\"t\":\"p\",\"ts\":\"2017-06-23T13:46:08.110Z\",\"ls\":\"2017-12-28T17:24:18.085Z\",\"name\":\"android-native-sdk\",\"rid\":\"2vmeeZapHrxqWKif2\",\"f\":true,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T17:24:18.085Z\",\"_id\":\"wpfdt8yN7AgxXFBit\"},{\"t\":\"p\",\"ts\":\"2017-06-23T13:46:11.778Z\",\"ls\":\"2017-12-28T17:30:42.199Z\",\"name\":\"important\",\"rid\":\"QG6WKaB3YZKzv2ykN\",\"f\":true,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T17:30:42.199Z\",\"_id\":\"kudTrSy66TxWYTf7P\"},{\"t\":\"d\",\"ls\":\"2017-12-28T17:47:01.270Z\",\"name\":\"patricia.ferreira\",\"fname\":\"Patricia Ferreira\",\"rid\":\"KK6xPd6zQb5MyEjYbcBD6dHc7oBvGjkruM\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T17:47:01.270Z\",\"_id\":\"KChQdaKHHcssJRY9X\"},{\"t\":\"p\",\"ts\":\"2017-09-29T16:48:11.578Z\",\"ls\":\"2017-12-28T17:53:55.045Z\",\"name\":\"rocketchat-working-on\",\"fname\":\"rocketchat-working-on\",\"rid\":\"Y6587MM9T2ca4m9AP\",\"f\":true,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\",\"name\":\"Filipe Brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T17:53:55.045Z\",\"_id\":\"NwayWg3QYkgBtf6yR\"},{\"t\":\"p\",\"ts\":\"2017-06-23T13:46:49.910Z\",\"ls\":\"2017-12-28T18:00:22.964Z\",\"name\":\"rocket-dev\",\"rid\":\"FATCnDk5egNtRvQfv\",\"f\":true,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T18:00:22.964Z\",\"_id\":\"KQ7E5Wupm3zgwbuGn\"},{\"t\":\"p\",\"ts\":\"2017-08-15T13:55:45.678Z\",\"ls\":\"2017-12-28T18:00:32.714Z\",\"name\":\"android-app-rewrite\",\"fname\":\"android-app-rewrite\",\"rid\":\"5KAw6vTLBkSJKefae\",\"f\":true,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\",\"name\":null},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T18:00:32.714Z\",\"_id\":\"5RR63MR3gCpCjDwXL\"},{\"t\":\"d\",\"ls\":\"2017-12-28T23:51:18.324Z\",\"name\":\"lucio.maciel\",\"fname\":\"Lucio F. Maciel\",\"rid\":\"8MyxXwfqeioYwmnnKcBD6dHc7oBvGjkruM\",\"f\":true,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-28T23:51:18.324Z\",\"_id\":\"N3wquauNbqcE2DjQf\"},{\"t\":\"c\",\"ts\":\"2017-12-28T17:32:21.630Z\",\"ls\":\"2017-12-29T12:59:12.003Z\",\"name\":\"jobs\",\"fname\":null,\"rid\":\"uaNMXwBvMSd8Lt2zG\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\",\"name\":\"Filipe Brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-29T12:59:12.003Z\",\"_id\":\"PMi8KzCM2cmKXHspk\"},{\"t\":\"c\",\"ts\":\"2017-09-21T19:01:58.358Z\",\"ls\":\"2017-12-29T12:59:38.759Z\",\"name\":\"iosnativeapp\",\"fname\":null,\"rid\":\"9fcPiSCwpW8uB6fok\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\",\"name\":\"Filipe Brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-29T12:59:38.759Z\",\"_id\":\"FfAp2WJckty6QMNXM\"},{\"t\":\"p\",\"ts\":\"2017-07-25T14:23:51.478Z\",\"ls\":\"2017-12-29T13:15:32.565Z\",\"name\":\"mobile-internal\",\"rid\":\"tn3EiAYecbtXGEBDn\",\"f\":true,\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"archived\":false,\"_updatedAt\":\"2017-12-29T13:15:32.565Z\",\"_id\":\"f7whSKN8JXy9v8zYT\"},{\"t\":\"p\",\"ts\":\"2017-12-29T13:21:20.960Z\",\"ls\":\"2017-12-29T13:25:52.901Z\",\"name\":\"rocketchat-ux\",\"fname\":\"rocketchat-ux\",\"rid\":\"AALrfqnPPNykhvhWo\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\",\"name\":\"Filipe Brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-29T13:25:52.901Z\",\"_id\":\"PF8g9i7pKzZqBBZEm\"},{\"t\":\"c\",\"ts\":\"2017-06-23T12:30:03.592Z\",\"ls\":\"2017-12-29T13:35:47.991Z\",\"name\":\"general\",\"rid\":\"GENERAL\",\"u\":{\"_id\":\"cBD6dHc7oBvGjkruM\",\"username\":\"filipe.brito\"},\"open\":true,\"alert\":false,\"unread\":0,\"userMentions\":0,\"groupMentions\":0,\"_updatedAt\":\"2017-12-29T13:35:47.991Z\",\"disableNotifications\":true,\"hideUnreadStatus\":true,\"_id\":\"vbQdXYh5vjKXbRjBz\"}],\"remove\":[],\"success\":true}\n"

const val SPOTLIGHT_OK = """
{
  "users": [
    {
      "_id": "chhtYqts4toAbrZa5",
      "status": "offline",
      "name": "Juli Aaron",
      "username": ".JULIUS."
    },
    {
      "_id": "XNC9LLDjDNHuTShaT",
      "status": "offline",
      "name": "0xBAADF00D",
      "username": "0xBAADF00D"
    },
    {
      "_id": "X3C5EE8zJvaK5qf4R",
      "status": "offline",
      "name": "Chris Chan",
      "username": "1111aaaa"
    },
    {
      "_id": "ham9RwxvovNiaYL86",
      "status": "offline",
      "name": "11qqaazz",
      "username": "11qqaazz"
    },
    {
      "_id": "qan7vwcb8KdzqcDgt",
      "status": "offline",
      "name": "213123",
      "username": "213123"
    }
  ],
  "rooms": [
    {
      "_id": "s6To7BxcMCz7NhGbs",
      "name": "....aaa",
      "t": "c",
      "lastMessage": {
        "_id": "bhDt3YP3QxThCrWTs",
        "rid": "s6To7BxcMCz7NhGbs",
        "msg": "anyone",
        "ts": "2018-03-01T12:58:35.533Z",
        "u": {
          "_id": "kkwJYjvX4AJwKQsDu",
          "username": "KALI_x",
          "name": "madest yut"
        },
        "mentions": [],
        "channels": [],
        "_updatedAt": "2018-03-01T12:58:35.611Z",
        "sandstormSessionId": null
      }
    },
    {
      "_id": "6ajjqC89zxhAt2osE",
      "name": "111aaabogie",
      "t": "c",
      "muted": []
    },
    {
      "_id": "EcnGDW25oXgAdKt55",
      "name": "12aasdfasdf",
      "t": "c",
      "muted": []
    },
    {
      "_id": "b262hW5tRW5suK8oy",
      "name": "3333aaa",
      "t": "c",
      "muted": []
    },
    {
      "_id": "kCbAciMgsEqXnnNqN",
      "name": "Aa123123123",
      "t": "c",
      "muted": []
    }
  ],
  "success": true
}
"""

const val QUERY_USERS_SUCCESS =
    "{\"users\":[{\"_id\":\"2XjnFaM4unjqRh96A\",\"status\":\"offline\",\"name\":\"gbr\",\"username\":\"gbr\",\"active\":true,\"utcOffset\":-2,\"type\":\"user\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"22ekPacQhzNDTsjdh\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Guillaume Bourdages\"},{\"_id\":\"22Gi3Ly4vicbvgCgb\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Hieu Hiep Nguyen\",\"utcOffset\":7,\"username\":\"hieu.hiep.nguyen\"},{\"_id\":\"22M8zeDBQYswLNNq5\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Reginaldo Santos\",\"utcOffset\":-2,\"username\":\"reginaldosantos.br\"},{\"_id\":\"22nxm44GD9TDupPMd\",\"status\":\"offline\",\"active\":true,\"name\":\"irishnugget\",\"utcOffset\":-5,\"username\":\"irishnugget\",\"type\":\"user\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"22ytF4wzso6srWbsQ\",\"status\":\"offline\",\"name\":\"Greg\",\"username\":\"ssorizdabest\",\"active\":true,\"type\":\"user\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"22zBQWatMzn47czgg\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Gorge\",\"utcOffset\":-5,\"username\":\"gorge-1\"},{\"_id\":\"23478PFrdDxLFpYL4\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"khejing\",\"utcOffset\":8,\"username\":\"khejing\"},{\"_id\":\"235seAv3Po9uYv3PL\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Raffe Bergwall\",\"utcOffset\":2,\"username\":\"raffe.bergwall\"},{\"_id\":\"23YSKn8oZkdWg2XE3\",\"status\":\"offline\",\"name\":\"yangada\",\"username\":\"yangada\",\"active\":true,\"type\":\"user\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"23w3J4eD2iSpLFbB7\",\"status\":\"offline\",\"active\":true,\"name\":\"Julian Lugod\",\"utcOffset\":8,\"username\":\"akiraaisha\",\"type\":\"user\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"23wN6zqD3CamJBYSy\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"dumingqiao\",\"utcOffset\":8,\"username\":\"dumingqiao\"},{\"_id\":\"244YgWgXCpKWF5HsK\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"algenerale\",\"utcOffset\":1,\"username\":\"algenerale\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"247ffn8NF75rrnWBv\",\"status\":\"offline\",\"name\":\"Alexandr Estegneev\",\"username\":\"estadok\",\"active\":true,\"type\":\"user\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"247uRyvemCv87Xery\",\"status\":\"offline\",\"active\":true,\"name\":\"jav grvia\",\"utcOffset\":-5,\"username\":\"jav.grvia\",\"settings\":{\"preferences\":{\"useEmojis\":true,\"convertAsciiEmoji\":true,\"saveMobileBandwidth\":true,\"autoImageLoad\":true,\"viewMode\":0}},\"type\":\"user\"},{\"_id\":\"249cS934B56Nq45tH\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Serge Rodin\",\"utcOffset\":3,\"username\":\"serge.rodin\"},{\"_id\":\"24XdGFBmpgdXsC7ib\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"keeg\",\"utcOffset\":-5,\"username\":\"keeg\"},{\"_id\":\"24f4axXB7fDfvvntC\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"abcdefg\",\"utcOffset\":-7,\"username\":\"abcdefg-1\"},{\"_id\":\"24pupyrkX6nC4Qfsm\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Oleg Seregin\",\"utcOffset\":3,\"username\":\"Nartalon\"},{\"_id\":\"24rSi7zg3n9PErPtj\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Berislav Purgar\",\"utcOffset\":1,\"username\":\"joe.doe\"},{\"_id\":\"24trN3on8LvhEjYwT\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Miguel Mendez\",\"utcOffset\":-5,\"username\":\"mikemndz\"},{\"_id\":\"24vSocp5xzSJ8CdHn\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Mung Thai\",\"utcOffset\":-4,\"username\":\"Mung.Thai\"},{\"_id\":\"2548PFDZ3Sbu7stpW\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Jason Jang\",\"utcOffset\":9,\"username\":\"jason.jang\"},{\"_id\":\"25kfvQZh5TZhZmkax\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Apta Gemilang\",\"utcOffset\":7,\"username\":\"sad231\"},{\"_id\":\"25oKJyvdMMMupbci9\",\"status\":\"offline\",\"name\":\"shige imo\",\"username\":\"shige.imo\",\"active\":true,\"type\":\"user\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"25smgS9qBk6AumwRs\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"sasgroupeaxone\",\"utcOffset\":2,\"username\":\"sasgroupeaxone\"},{\"_id\":\"25tYKuxouEq8Y2PMr\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"yu zhang\",\"utcOffset\":8,\"username\":\"yu.zhang\"},{\"_id\":\"25woScsha2ZPamcGY\",\"status\":\"offline\",\"active\":true,\"name\":\"Hugo Henry\",\"utcOffset\":2,\"username\":\"hugo.henry\",\"type\":\"user\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"25yPxjaobvW4HjT2c\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"gregory\"},{\"_id\":\"25zkCHMLu32mr4XSA\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"changingedu@163.com\",\"utcOffset\":8,\"username\":\"changingeduat163.com\"},{\"_id\":\"26FvTvd2cQ4A4kEv5\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Magzhan Mekebai\",\"utcOffset\":6,\"username\":\"magzhan.mekebai\"},{\"_id\":\"26HazKt7ad9589R2o\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Sagar\",\"utcOffset\":-7,\"username\":\"sagar-3\"},{\"_id\":\"26Kgt5TtaqpNKctXT\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"George Orwa\",\"utcOffset\":3,\"username\":\"george.orwa\"},{\"_id\":\"26ZtLhe6WTaPSenGJ\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Junseong Lee\",\"utcOffset\":9,\"username\":\"junseong.lee\"},{\"_id\":\"26fxNBhosPjQXuQa8\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Mario Behling\",\"utcOffset\":2,\"username\":\"mario.behling\"},{\"_id\":\"26muqz6kT8jscsHgL\",\"status\":\"offline\",\"active\":true,\"name\":\"Trygve Høiseth\",\"utcOffset\":1,\"username\":\"trygve.gaysir\",\"type\":\"user\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"26p4pn4QneRjNqSEg\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Karlyn Fielding\",\"utcOffset\":-7,\"username\":\"karlyn.fielding\"},{\"_id\":\"26sLQXcYYEhMYpMk5\",\"status\":\"offline\",\"active\":true,\"name\":\"jgmiao\",\"utcOffset\":8,\"username\":\"jgmiao\",\"type\":\"user\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"26vQRwCJ4gvS9txBe\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Kwangyo Cho\",\"utcOffset\":9,\"username\":\"kwangyo.cho\"},{\"_id\":\"274axySChdZB7XDcg\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"yuezang\",\"utcOffset\":8,\"username\":\"yuezang\"},{\"_id\":\"277wDtqrkWu5RRuiZ\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Monzerghasan\",\"utcOffset\":2,\"username\":\"monzerghasan\"},{\"_id\":\"27BbwSmFYNvoBEzBg\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Thitipong Nick Krungkaew\",\"utcOffset\":7,\"username\":\"tuahear\"},{\"_id\":\"27dJfcEKiLjwaWC6X\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Andrew Huggins\",\"utcOffset\":-5,\"username\":\"ahuggins\"},{\"_id\":\"27tM4bLEDKuaYAfhm\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"George Rome\",\"utcOffset\":0,\"username\":\"george.rome\"},{\"_id\":\"27xj647aJ5QZvStLz\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Yongjiasu\",\"utcOffset\":8,\"username\":\"Yongjiasu\"},{\"_id\":\"2838d8SzccRjTspoT\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Kim Banga\",\"utcOffset\":2,\"username\":\"kimbanga\"},{\"_id\":\"28G6ri5ib2kTv4Y5g\",\"type\":\"user\",\"status\":\"offline\",\"active\":true,\"name\":\"Agon Bina\",\"utcOffset\":2,\"username\":\"abina\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"28PZ9sjbmrzk5Mebb\",\"status\":\"offline\",\"name\":\"twegener\",\"username\":\"twegener\",\"active\":true,\"type\":\"user\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"28cNgahrcwm7wYCrg\",\"status\":\"offline\",\"active\":true,\"name\":\"Michael Taggart\",\"utcOffset\":-8,\"username\":\"mttaggart\",\"type\":\"user\",\"settings\":{\"preferences\":{\"viewMode\":0}}},{\"_id\":\"28i3sRrt95JMrKNRi\",\"status\":\"offline\",\"active\":true,\"name\":\"Anar-Erdene Batjargal\",\"utcOffset\":9,\"username\":\"anar.erdene.batjargal\",\"type\":\"user\",\"settings\":{\"preferences\":{\"viewMode\":0}}}],\"count\":50,\"offset\":0,\"total\":28148,\"success\":true}"

const val INCORRECT_PARAM_PROVIDED = "{\"success\":false,\"error\":\"fun is not a function\"}"

const val CREATE_CHANNEL_SUCCESS =
    "{\"channel\":{\"_id\":\"JeJcd4PE9d9fvjakf\",\"name\":\"elf\",\"fname\":\"elf\",\"t\":\"c\",\"msgs\":0,\"u\":{\"_id\":\"MaBK2dquY8TbaH6d3\",\"username\":\"aniket03\"},\"customFields\":{},\"ts\":\"2018-03-13T14:42:46.849Z\",\"ro\":false,\"sysMes\":true,\"_updatedAt\":\"2018-03-13T14:42:46.850Z\"},\"success\":true}"

const val FAIL_DUPLICATE_CHANNEL =
    "{\"success\":false,\"error\":\"A channel with name 'elf' exists [error-duplicate-channel-name]\",\"errorType\":\"error-duplicate-channel-name\"}"

const val ROLES_OK = """
{
  "username": "rafaelks",
  "roles": [
    "admin"
  ],
  "_id": "hvzu8z6mHFigiXy6Y",
  "success": true
}
"""
// {"message":{"_id":"1abbbf94-c839-4436-9476-6de03011c1e0","rid":"GS3Ceh7BLJGzfto78","msg":"Não"}}
const val SEND_MESSAGE_WITH_ID_OK = """
{
  "message": {
    "_id": "1abbbf94-c839-4436-9476-6de03011c1e0",
    "rid": "GENERAL",
    "msg": "Sending message from SDK to #general and @here",
    "ts": "2018-04-04T22:37:59.167Z",
    "u": {
      "_id": "vKjyfQkgekhXykvKk",
      "username": "bruce.lee",
      "name": "Bruce Lee"
    },
    "mentions": [],
    "channels": [],
    "_updatedAt": "2018-04-04T22:37:59.248Z"
  },
  "success": true
}
"""

const val CREATE_DM_OK = """
{
    "room": {
        "_id": "Lymsiu4Mn6xjTAan4RtMDEYc28fQ5aHpf4",
        "_updatedAt": "2018-03-26T19:11:50.711Z",
        "t": "d",
        "msgs": 0,
        "ts": "2018-03-26T19:11:50.711Z",
        "meta": {
            "revision": 0,
            "created": 1522094603745,
            "version": 0
        },
        "usernames": [
            "rocket.cat",
            "user.test"
        ]
    },
    "success": true
}
"""

const val DIRECTORY_USERS_OK = "{\n" +
        "    \"result\": [\n" +
        "        {\n" +
        "            \"_id\": \"jRca8kibJx8NkLJxt\",\n" +
        "            \"createdAt\": \"2018-04-13T12:46:26.517Z\",\n" +
        "            \"emails\": [\n" +
        "                {\n" +
        "                    \"address\": \"user.test.1523623548558@rocket.chat\",\n" +
        "                    \"verified\": false\n" +
        "                }\n" +
        "            ],\n" +
        "            \"name\": \"EditedRealNameuser.test.1523623548558\",\n" +
        "            \"username\": \"editedusernameuser.test.1523623548558\"\n" +
        "        }\n" +
        "    ],\n" +
        "    \"count\": 1,\n" +
        "    \"offset\": 0,\n" +
        "    \"total\": 1,\n" +
        "    \"success\": true\n" +
        "}"

const val DIRECTORY_CHANNELS_OK = "{\n" +
        "    \"result\": [\n" +
        "        {\n" +
        "            \"_id\": \"GENERAL\",\n" +
        "            \"ts\": \"2018-05-15T19:10:54.689Z\",\n" +
        "            \"name\": \"general\",\n" +
        "            \"usernames\": [\n" +
        "                \"rocketchat.internal.admin.test\",\n" +
        "                \"editedusernameuser.test.1526941091574\"\n" +
        "            ]\n" +
        "        }\n" +
        "    ],\n" +
        "    \"count\": 1,\n" +
        "    \"offset\": 2,\n" +
        "    \"total\": 4,\n" +
        "    \"success\": true\n" +
        "}"