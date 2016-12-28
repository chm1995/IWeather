package com.iweather.android;

import java.util.List;

/**
 * Created by asus1 on 2016/12/27.
 */

public class WeatherDataBean {

    /**
     * citycode : 101190101
     * rdesc : Success
     * forecast : [{"wind":{"dir":"东风","deg":"328","sc":"微风","spd":"3"},"hum":"67","pcpn":"0.0","astro":{"mr":"05:49","sr":"07:04","ms":"16:32","ss":"17:08"},"uv":"N/A","tmp":{"min":"2","max":"6"},"pop":"0","date":"2016-12-28","pres":"1030","cond":{"cond_n":"小雨","cond_d":"晴"},"vis":"10"},{"wind":{"dir":"北风","deg":"74","sc":"3-4","spd":"16"},"hum":"73","pcpn":"0.0","astro":{"mr":"06:40","sr":"07:04","ms":"17:21","ss":"17:09"},"uv":"N/A","tmp":{"min":"-1","max":"7"},"pop":"0","date":"2016-12-29","pres":"1032","cond":{"cond_n":"晴","cond_d":"晴"},"vis":"10"},{"wind":{"dir":"东风","deg":"254","sc":"微风","spd":"9"},"hum":"78","pcpn":"0.0","astro":{"mr":"07:29","sr":"07:05","ms":"18:12","ss":"17:10"},"uv":"N/A","tmp":{"min":"2","max":"9"},"pop":"0","date":"2016-12-30","pres":"1029","cond":{"cond_n":"多云","cond_d":"晴"},"vis":"10"},{"wind":{"dir":"西风","deg":"118","sc":"3-4","spd":"11"},"hum":"78","pcpn":"0.0","astro":{"mr":"08:15","sr":"07:05","ms":"19:07","ss":"17:10"},"uv":"N/A","tmp":{"min":"0","max":"10"},"pop":"0","date":"2016-12-31","pres":"1029","cond":{"cond_n":"多云","cond_d":"多云"},"vis":"10"},{"wind":{"dir":"西风","deg":"310","sc":"3-4","spd":"11"},"hum":"80","pcpn":"0.0","astro":{"mr":"08:58","sr":"07:05","ms":"20:04","ss":"17:11"},"uv":"N/A","tmp":{"min":"3","max":"10"},"pop":"0","date":"2017-01-01","pres":"1026","cond":{"cond_n":"阴","cond_d":"多云"},"vis":"10"},{"wind":{"dir":"东北风","deg":"70","sc":"微风","spd":"2"},"hum":"75","pcpn":"0.0","astro":{"mr":"09:39","sr":"07:05","ms":"21:02","ss":"17:12"},"uv":"N/A","tmp":{"min":"6","max":"12"},"pop":"0","date":"2017-01-02","pres":"1028","cond":{"cond_n":"阴","cond_d":"多云"},"vis":"10"}]
     * rcode : 200
     * suggestion : {"trav":{"brf":"适宜","txt":"天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。"},"uv":{"brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"},"flu":{"brf":"较易发","txt":"天凉，昼夜温差较大，较易发生感冒，请适当增减衣服，体质较弱的朋友请注意适当防护。"},"comf":{"brf":"较舒适","txt":"白天虽然天气晴好，但早晚会感觉偏凉，午后舒适、宜人。"},"sport":{"brf":"较适宜","txt":"天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意避风保暖。"},"air":{"brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"},"cw":{"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},"drs":{"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"}}
     * cityname : 南京
     */

    private String citycode;
    private String rdesc;
    private int rcode;
    private SuggestionBean suggestion;
    private String cityname;
    private List<ForecastBean> forecast;

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc;
    }

    public int getRcode() {
        return rcode;
    }

    public void setRcode(int rcode) {
        this.rcode = rcode;
    }

    public SuggestionBean getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(SuggestionBean suggestion) {
        this.suggestion = suggestion;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public List<ForecastBean> getForecast() {
        return forecast;
    }

    public void setForecast(List<ForecastBean> forecast) {
        this.forecast = forecast;
    }



    public static class SuggestionBean {
        /**
         * trav : {"brf":"适宜","txt":"天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。"}
         * uv : {"brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"}
         * flu : {"brf":"较易发","txt":"天凉，昼夜温差较大，较易发生感冒，请适当增减衣服，体质较弱的朋友请注意适当防护。"}
         * comf : {"brf":"较舒适","txt":"白天虽然天气晴好，但早晚会感觉偏凉，午后舒适、宜人。"}
         * sport : {"brf":"较适宜","txt":"天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意避风保暖。"}
         * air : {"brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"}
         * cw : {"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"}
         * drs : {"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"}
         */

        private TravBean trav;
        private UvBean uv;
        private FluBean flu;
        private ComfBean comf;
        private SportBean sport;
        private AirBean air;
        private CwBean cw;
        private DrsBean drs;

        public TravBean getTrav() {
            return trav;
        }

        public void setTrav(TravBean trav) {
            this.trav = trav;
        }

        public UvBean getUv() {
            return uv;
        }

        public void setUv(UvBean uv) {
            this.uv = uv;
        }

        public FluBean getFlu() {
            return flu;
        }

        public void setFlu(FluBean flu) {
            this.flu = flu;
        }

        public ComfBean getComf() {
            return comf;
        }

        public void setComf(ComfBean comf) {
            this.comf = comf;
        }

        public SportBean getSport() {
            return sport;
        }

        public void setSport(SportBean sport) {
            this.sport = sport;
        }

        public AirBean getAir() {
            return air;
        }

        public void setAir(AirBean air) {
            this.air = air;
        }

        public CwBean getCw() {
            return cw;
        }

        public void setCw(CwBean cw) {
            this.cw = cw;
        }

        public DrsBean getDrs() {
            return drs;
        }

        public void setDrs(DrsBean drs) {
            this.drs = drs;
        }

        public static class TravBean {
            /**
             * brf : 适宜
             * txt : 天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class UvBean {
            /**
             * brf : 中等
             * txt : 属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class FluBean {
            /**
             * brf : 较易发
             * txt : 天凉，昼夜温差较大，较易发生感冒，请适当增减衣服，体质较弱的朋友请注意适当防护。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class ComfBean {
            /**
             * brf : 较舒适
             * txt : 白天虽然天气晴好，但早晚会感觉偏凉，午后舒适、宜人。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class SportBean {
            /**
             * brf : 较适宜
             * txt : 天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意避风保暖。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class AirBean {
            /**
             * brf : 良
             * txt : 气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class CwBean {
            /**
             * brf : 较适宜
             * txt : 较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class DrsBean {
            /**
             * brf : 较冷
             * txt : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }
    }

    public static class ForecastBean {
        /**
         * wind : {"dir":"东风","deg":"328","sc":"微风","spd":"3"}
         * hum : 67
         * pcpn : 0.0
         * astro : {"mr":"05:49","sr":"07:04","ms":"16:32","ss":"17:08"}
         * uv : N/A
         * tmp : {"min":"2","max":"6"}
         * pop : 0
         * date : 2016-12-28
         * pres : 1030
         * cond : {"cond_n":"小雨","cond_d":"晴"}
         * vis : 10
         */

        private WindBean wind;
        private String hum;
        private String pcpn;
        private AstroBean astro;
        private String uv;
        private TmpBean tmp;
        private String pop;
        private String date;
        private String pres;
        private CondBean cond;
        private String vis;

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getPcpn() {
            return pcpn;
        }

        public void setPcpn(String pcpn) {
            this.pcpn = pcpn;
        }

        public AstroBean getAstro() {
            return astro;
        }

        public void setAstro(AstroBean astro) {
            this.astro = astro;
        }

        public String getUv() {
            return uv;
        }

        public void setUv(String uv) {
            this.uv = uv;
        }

        public TmpBean getTmp() {
            return tmp;
        }

        public void setTmp(TmpBean tmp) {
            this.tmp = tmp;
        }

        public String getPop() {
            return pop;
        }

        public void setPop(String pop) {
            this.pop = pop;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getPres() {
            return pres;
        }

        public void setPres(String pres) {
            this.pres = pres;
        }

        public CondBean getCond() {
            return cond;
        }

        public void setCond(CondBean cond) {
            this.cond = cond;
        }

        public String getVis() {
            return vis;
        }

        public void setVis(String vis) {
            this.vis = vis;
        }

        public static class WindBean {
            /**
             * dir : 东风
             * deg : 328
             * sc : 微风
             * spd : 3
             */

            private String dir;
            private String deg;
            private String sc;
            private String spd;

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getDeg() {
                return deg;
            }

            public void setDeg(String deg) {
                this.deg = deg;
            }

            public String getSc() {
                return sc;
            }

            public void setSc(String sc) {
                this.sc = sc;
            }

            public String getSpd() {
                return spd;
            }

            public void setSpd(String spd) {
                this.spd = spd;
            }
        }

        public static class AstroBean {
            /**
             * mr : 05:49
             * sr : 07:04
             * ms : 16:32
             * ss : 17:08
             */

            private String mr;
            private String sr;
            private String ms;
            private String ss;

            public String getMr() {
                return mr;
            }

            public void setMr(String mr) {
                this.mr = mr;
            }

            public String getSr() {
                return sr;
            }

            public void setSr(String sr) {
                this.sr = sr;
            }

            public String getMs() {
                return ms;
            }

            public void setMs(String ms) {
                this.ms = ms;
            }

            public String getSs() {
                return ss;
            }

            public void setSs(String ss) {
                this.ss = ss;
            }
        }

        public static class TmpBean {
            /**
             * min : 2
             * max : 6
             */

            private String min;
            private String max;

            public String getMin() {
                return min;
            }

            public void setMin(String min) {
                this.min = min;
            }

            public String getMax() {
                return max;
            }

            public void setMax(String max) {
                this.max = max;
            }
        }

        public static class CondBean {
            /**
             * cond_n : 小雨
             * cond_d : 晴
             */

            private String cond_n;
            private String cond_d;

            public String getCond_n() {
                return cond_n;
            }

            public void setCond_n(String cond_n) {
                this.cond_n = cond_n;
            }

            public String getCond_d() {
                return cond_d;
            }

            public void setCond_d(String cond_d) {
                this.cond_d = cond_d;
            }
        }
    }
}
