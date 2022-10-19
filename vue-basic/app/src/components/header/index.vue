<template>
  <header class="header">
    <!-- 头部的第一行 -->
    <div class="top">
      <div class="container">
        <div class="loginList">
          <p>
            <router-link to="/home" class="font">上课吧</router-link>
          </p>
          <p>
            <span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
            <router-link to="/login" class="font">首页</router-link>
            <router-link to="/register" class="register font"
              >会员中心</router-link
            >
          </p>
        </div>
        <div class="typeList">
          <a href="###">登录</a>
          <a href="###">注册</a>
          <a href="###">关于</a>
        </div>
      </div>
    </div>
    <!--头部第二行 搜索区域-->
    <div class="bottom">
      <h1 class="logoArea">
        <router-link class="logo" to="/home">
          <img src="./images/logo.png" alt="" />
        </router-link>
      </h1>
      <div class="searchArea">
        <form action="###" class="searchForm">
          <input
            type="text"
            id="autocomplete"
            class="input-error input-xxlarge"
            placeholder="课程名"
          />
          <button
            class="sui-btn btn-xlarge btn-danger"
            type="button"
            @click="goSearch"
          >
            搜索
          </button>
        </form>
      </div>
    </div>
  </header>
</template>

<script>
export default {
  name: "",
  methods: {
    // 搜索按钮的回调函数，向search路由进行跳转
    goSearch() {
      this.$router.push("/search");
    },
  },
};
</script>

<style lang="less" scoped>
.header {
  & > .top {
    background-color: #383838;
    height: 40px;
    line-height: 40px;
    font-size: 14px;
    color: #d1d1d1;

    .container {
      width: 100%;
      margin: 0 auto;
      overflow: hidden;

      .loginList {
        float: left;
        margin-left: 2%;

        p {
          float: left;
          margin-right: 10px;

          .font {
            color: #d1d1d1;
          }

          .register {
            border-left: 1px solid #eeeeee;
            padding: 0 15px;
            margin-left: 15px;
          }
        }
      }

      .typeList {
        float: right;
        margin-right: 2%;

        a {
          padding: 0 10px;
          color: #d1d1d1;

          & + a {
            border-left: 1px solid #eeeeee;
          }
        }
      }
    }
  }

  & > .bottom {
    width: 100%;
    margin: 0 auto;
    overflow: hidden;

    .logoArea {
      float: left;

      .logo {
        img {
          width: 175px;
          margin: 25px 45px;
        }
      }
    }

    .searchArea {
      float: right;
      margin-top: 35px;

      .searchForm {
        overflow: hidden;

        input {
          box-sizing: border-box;
          width: 490px;
          height: 32px;
          padding: 0px 4px;
          border: 2px solid #ea4a36;
          float: left;

          &:focus {
            outline: none;
          }
        }

        button {
          height: 32px;
          width: 68px;
          background-color: #ea4a36;
          border: none;
          color: #fff;
          float: left;
          cursor: pointer;

          &:focus {
            outline: none;
          }
        }
      }
    }
  }
}
</style>