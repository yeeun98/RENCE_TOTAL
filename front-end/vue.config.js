const { defineConfig } = require('@vue/cli-service');

module.exports = {
  outputDir: '../src/main/resources/static',
  indexPath: '../public/index.html',
  devServer: {
    proxy: {
      '/api': {
        target: 'http://localhost:8800/',
        changeOrigin: true,
      },
    },
  },
  chainWebpack: (config) => {
    const svgRule = config.module.rule('svg');
    svgRule.uses.clear();
    svgRule.use('vue-svg-loader').loader('vue-svg-loader');
  },
};

module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: false,
});
