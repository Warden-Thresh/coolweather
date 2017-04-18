package com.warden.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Warden on 2017/4/18.
 */

public class GankFuLi {

    /**
     * error : false
     * results : [{"_id":"58f5649b421aa9544825f89f","createdAt":"2017-04-18T08:58:03.511Z","desc":"4-18","publishedAt":"2017-04-18T11:34:29.203Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-18-17882540_190116561497334_440657494176432128_n.jpg","used":true,"who":"带马甲"},{"_id":"58f3980c421aa9544b773ff1","createdAt":"2017-04-17T00:13:00.136Z","desc":"4-17","publishedAt":"2017-04-17T11:32:14.674Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-16-17934400_1738549946443321_2924146161843437568_n.jpg","used":true,"who":"daimajia"},{"_id":"58f0438f421aa9544825f873","createdAt":"2017-04-14T11:35:43.995Z","desc":"4-14","publishedAt":"2017-04-14T11:46:48.47Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-14-17881962_1329090457138411_8289893708619317248_n.jpg","used":true,"who":"代码家"},{"_id":"58eef016421aa9544b773fd0","createdAt":"2017-04-13T11:27:18.557Z","desc":"4-13","publishedAt":"2017-04-13T11:36:04.435Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-13-17882785_926451654163513_7725522121023029248_n.jpg","used":true,"who":"dmj"},{"_id":"58ed8242421aa9544b773fc1","createdAt":"2017-04-12T09:26:26.434Z","desc":"4-12","publishedAt":"2017-04-12T12:12:18.213Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-12-17662441_1675934806042139_7236493360834281472_n.jpg","used":true,"who":"daimajia"},{"_id":"58ec30e4421aa9544ed88919","createdAt":"2017-04-11T09:27:00.840Z","desc":"4-11","publishedAt":"2017-04-11T14:43:34.738Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-11-17881546_248332202297978_2420944671002853376_n.jpg","used":true,"who":"dmj"},{"_id":"58ea5f51421aa954511ebe51","createdAt":"2017-04-10T00:20:33.996Z","desc":"4-10","publishedAt":"2017-04-10T12:11:14.794Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-09-17586558_426275167734768_6312107349515436032_n.jpg","used":true,"who":"dmj"},{"_id":"58e6dec3421aa90d6f211e4a","createdAt":"2017-04-07T08:35:15.664Z","desc":"4-7","publishedAt":"2017-04-07T12:02:31.316Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-07-17817932_274034076387428_5240190736292380672_n.jpg","used":true,"who":"带马甲"},{"_id":"58e5bd9c421aa90d6f211e3f","createdAt":"2017-04-06T12:01:32.576Z","desc":"4-6","publishedAt":"2017-04-06T12:06:10.17Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-06-17493825_1061197430652762_1457834104966873088_n.jpg","used":true,"who":"代码家"},{"_id":"58e3198e421aa90d6bc75ab4","createdAt":"2017-04-04T11:57:02.111Z","desc":"4-4","publishedAt":"2017-04-05T11:50:18.748Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-04-17438270_1418311001574160_8728796670000627712_n.jpg","used":true,"who":"dmj"},{"_id":"58ddcb2b421aa969f51a911e","createdAt":"2017-03-31T11:21:15.303Z","desc":"3-31","publishedAt":"2017-03-31T11:26:54.330Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-31-17662615_1819763634937161_2829588299293655040_n.jpg","used":true,"who":"dmj"},{"_id":"58dc5645421aa969fd8a3dea","createdAt":"2017-03-30T08:50:13.178Z","desc":"3-30","publishedAt":"2017-03-30T11:46:55.192Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-30-17265582_1877445642507654_3057988544061505536_n.jpg","used":true,"who":"dmj"},{"_id":"58db2305421aa969fb0fbed1","createdAt":"2017-03-29T10:59:17.522Z","desc":"3-29","publishedAt":"2017-03-29T11:48:49.343Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-29-17267498_392021674501739_8632065627013513216_n.jpg","used":true,"who":"dmj"},{"_id":"58d9b4e0421aa969f75cedeb","createdAt":"2017-03-28T08:57:04.208Z","desc":"3-28","publishedAt":"2017-03-28T12:05:55.791Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-28-17494350_115579865647756_2448160714821468160_n.jpg","used":true,"who":"dmj"},{"_id":"58d7dd53421aa93abb7d4e5a","createdAt":"2017-03-26T23:25:07.975Z","desc":"3-26","publishedAt":"2017-03-27T11:48:52.828Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-26-17495078_643307445877569_4485136026821459968_n.jpg","used":true,"who":"dmj"},{"_id":"58d49bad421aa93abf5d3b76","createdAt":"2017-03-24T12:08:13.590Z","desc":"3-24","publishedAt":"2017-03-24T12:12:34.753Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-24-17438359_1470934682925012_1066984844010979328_n.jpg","used":true,"who":"dmj"},{"_id":"58d33d54421aa95810795cc1","createdAt":"2017-03-23T11:13:24.719Z","desc":"3-23","publishedAt":"2017-03-23T11:44:38.634Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-23-17265820_645330569008169_4543676027339014144_n.jpg","used":true,"who":"dmj"},{"_id":"58d1e74e421aa90efc4fb70a","createdAt":"2017-03-22T10:54:06.864Z","desc":"3-22","publishedAt":"2017-03-22T11:47:09.555Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-22-17332868_1929305090624552_8918542166154805248_n.jpg","used":true,"who":"dmj"},{"_id":"58d08621421aa95810795ca1","createdAt":"2017-03-21T09:47:13.3Z","desc":"3-21","publishedAt":"2017-03-21T12:19:46.895Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-21-17268102_763630507137257_3620762734536163328_n%20-1-.jpg","used":true,"who":"dmj"},{"_id":"58cf3696421aa90f13178695","createdAt":"2017-03-20T09:55:34.360Z","desc":"3-20","publishedAt":"2017-03-20T11:44:56.224Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-20-17333300_1680707251945881_2009298023053524992_n.jpg","used":true,"who":"daimajia"}]
     */

    private boolean error;

    @SerializedName("results")
    private List<MeiZi> meizis;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<MeiZi> getMeizis() {
        return meizis;
    }

    public void setMeizis(List<MeiZi> meizis) {
        this.meizis = meizis;
    }

    public static class MeiZi {
        /**
         * _id : 58f5649b421aa9544825f89f
         * createdAt : 2017-04-18T08:58:03.511Z
         * desc : 4-18
         * publishedAt : 2017-04-18T11:34:29.203Z
         * source : chrome
         * type : 福利
         * url : http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-18-17882540_190116561497334_440657494176432128_n.jpg
         * used : true
         * who : 带马甲
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
