package com.youmias.elephant.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.youmias.elephant.po.IndustryFirst;
import com.youmias.elephant.po.IndustryTwo;
import com.youmias.elephant.po.Problem;
import com.youmias.elephant.service.InfomationService;
import com.youmias.elephant.service.ProblemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProblemController extends BaseController{

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
    private ProblemService problemService;
    @Autowired
    private InfomationService infomationService;

    /**
     * @Dec 我的提问
     * @Author zpw
     * @Time 2020-09-12
     *
     */

    @GetMapping("/secure/myProblems")
    public Map<String, Object> bymyProblems(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize,@RequestParam(name = "sponsorId") Integer sponsorId){
        try{
            Map<String,Object> map = new HashMap<>();
            PageHelper.startPage(pageNo,pageSize);
            PageInfo<Problem> pageInfo = new PageInfo<>(problemService.selectByProblemList(sponsorId));
            map.put("data",pageInfo);
            map.put("msg","成功");
            map.put("status","success");
            map.put("code","200");
            return  map;
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * @Dec 我的回答
     * @Author zpw
     * @Time 2020-09-13
     *
     */

    @GetMapping("/secure/myProblemsed")
    public Map<String, Object> bymyProblemsQues(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize,@RequestParam(name = "handlerId") Integer handlerId){
        try{
            Map<String,Object> map = new HashMap<>();
            PageHelper.startPage(pageNo,pageSize);
            PageInfo<Problem> pageInfo = new PageInfo<>(problemService.selectByProblemedList(handlerId));
            map.put("data",pageInfo);
            map.put("msg","成功");
            map.put("status","success");
            map.put("code","200");
            return  map;
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * @Dec 接受问题
     * @Author zpw
     * @Time 2020-09-13
     *
     */

    @PostMapping("/secure/hanleProblem")
    public Map<String, Object> hanleProblems(@RequestBody Problem problem){
        try{
            Map<String,Object> map = new HashMap<>();
            Problem p = new Problem();
            p.setId(problem.getId());
            p.setHandlerId(problem.getHandlerId());
            p.setStatus(2);
            p.setUpdateTime(new Date());
            problemService.updateHanlePeople(p);
            map.put("msg","成功");
            map.put("status","success");
            map.put("code","200");
            return  map;
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * @Dec 关闭问题
     * @Author zpw
     * @Time 2020-09-13
     *
     */

    @PostMapping("/secure/closeProblems")
    public Map<String, Object> closeProblems(@RequestBody Problem problem){
        try{
            Map<String,Object> map = new HashMap<>();
            Problem p = new Problem();
            p.setId(problem.getId());
            p.setStatus(3);
            p.setUpdateTime(new Date());
            problemService.closeProblem(p);
            map.put("msg","成功");
            map.put("status","success");
            map.put("code","200");
            return  map;
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * @Dec 根据关键字查询问题
     * @Author zpw
     * @Time 2020-09-12
     *
     */

    @GetMapping("/secure/byKeywordSelect")
    public Map<String, Object> bykeword(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize,@RequestParam(name = "keyword") String keyword){
        try{
            Map<String,Object> map = new HashMap<>();
            PageHelper.startPage(pageNo,pageSize);
            PageInfo<Problem> pageInfo = new PageInfo<>(problemService.byKeywordProblemList(keyword));
            map.put("data",pageInfo);
            map.put("msg","成功");
            map.put("status","success");
            map.put("code","200");
            return  map;
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * @Dec 查询分页问题
     * @Author zpw
     * @Time 2020-09-12
     *
     */

    @GetMapping("/secure/selectProblem")
    public Map<String, Object> selectProblemFn(@RequestParam Integer status, @RequestParam Integer pageNo , @RequestParam Integer pageSize){
        try{
            Map<String,Object> map = new HashMap<>();
            Problem p = new Problem();
            p.setStatus(status);
            PageHelper.startPage(pageNo,pageSize);
            PageInfo<Problem> pageInfo = new PageInfo<>(problemService.getProblemList(p));
            map.put("data",pageInfo);
            map.put("msg","成功");
            map.put("status","success");
            map.put("code","200");
            return  map;
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }

	/**
	 * @Dec 根据id查问题
	 * @Author zpw
	 * @Time 2020-09-11
	 *
	 */

	@GetMapping("/secure/selectById")
	public Map<String, Object> selectProblemFn(@RequestParam(name = "id") String id){
		try{
			Map<String,Object> map = new HashMap<>();
			Problem item = problemService.getProblemById(id);
			map.put("data",item);
			map.put("msg","成功");
			map.put("status","success");
			map.put("code","200");
			return  map;
		}catch (RuntimeException e){
			throw new RuntimeException(e);
		}
	}

    /**
     * @Dec 录入问题
     * @Author zpw
     * @Time 2020-09-12
     *
     */

    @PostMapping("/secure/insert")
    public Map<String, Object> insertProblem(@RequestBody Problem problem){
        try{
            Map<String,Object> map = new HashMap<>();
            Problem p = new Problem();
            String u =  UUID.randomUUID().toString();
            p.setId(u);
            p.setTitle(problem.getTitle());
            p.setDescription(problem.getDescription());
            p.setIndustryOneId(problem.getIndustryOneId());
            p.setIndustryTwoId(problem.getIndustryTwoId());
            p.setIndustryOneName(problem.getIndustryOneName());
            p.setIndustryTwoName(problem.getIndustryTwoName());
            p.setRank(problem.getRank());
            p.setCostGold(problem.getCostGold());
            p.setSponsorId(problem.getSponsorId());
            p.setStatus(1);
            p.setCost(problem.getCostGold()/10);
            p.setCreateTime(new Date());
            p.setUpdateTime(new Date());
            problemService.insertProblem(p);
            map.put("msg","成功");
            map.put("status","success");
            map.put("code","200");
            return  map;
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }

}
